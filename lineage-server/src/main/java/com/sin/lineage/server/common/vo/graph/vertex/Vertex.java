/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sin.lineage.server.common.vo.graph.vertex;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.Sets;
import lombok.Data;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Data
public class Vertex {

    private String name;

    private Set<String> columns = Sets.newHashSet();

    public Vertex(String name) {
        this.name = name;
    }

    public void addColumn(String column) {
        columns.add(column);
    }

    public void addColumns(List<String> columns) {
        if (CollUtil.isNotEmpty(columns)) {
            this.columns.addAll(columns);
        }
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Vertex)) return false;

        Vertex vertex = (Vertex) o;
        return Objects.equals(name, vertex.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
