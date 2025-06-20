# 前端构建阶段
FROM node:20-alpine AS lineage-web-builder
WORKDIR /opt/app/lineage-web

RUN npm install -g pnpm

# 复制前端依赖文件
COPY lineage-web/package.json lineage-web/pnpm-lock.yaml ./
RUN pnpm install --frozen-lockfile

COPY lineage-web/ ./
RUN pnpm run build

# 后端构建阶段
FROM eclipse-temurin:17.0.15_6-jdk AS lineage-server-builder
WORKDIR /opt/app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY lineage-parser/pom.xml lineage-parser/
COPY lineage-server/pom.xml lineage-server/

# 下载依赖
RUN ./mvnw dependency:go-offline

# 复制源代码
COPY lineage-parser/src lineage-parser/src
COPY lineage-server/src lineage-server/src
# 复制前端静态资源
COPY --from=lineage-web-builder /opt/app/lineage-web/dist/ lineage-server/src/main/resources/static/
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17.0.15_6-jre
WORKDIR /opt/app

COPY --from=lineage-server-builder /opt/app/lineage-server/target/lineage-server*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

