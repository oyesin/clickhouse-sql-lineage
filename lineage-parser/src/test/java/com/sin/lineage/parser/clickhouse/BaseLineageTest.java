package com.sin.lineage.parser.clickhouse;

import com.google.common.collect.Lists;
import com.sin.lineage.parser.struct.graph.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 基础的血缘测试类
 *
 * @author yesin
 * @date 2025/3/19
 */
public class BaseLineageTest {

    protected String sql;

    protected String[] expected;

    protected List<List<Node>> lineages;

    protected boolean isLog = false;

    @AfterEach
    void afterEach() {
        if (lineages == null) {
            return;
        }

        if (isLog) {
            System.out.println("未过滤中间表的血缘: ");
            lineages.forEach(v -> {
                List<Node> reverseList = Lists.newArrayList(v);
                Collections.reverse(reverseList);
                System.out.println(reverseList.stream().map(Node::toString).collect(Collectors.joining("->")));
            });
        }
        List<String> list = lineages.stream()
                .map(v -> v.get(v.size() - 1) + "->" + v.get(0).toString())
                .collect(Collectors.toList());

        String actualLineage = getActualLineage(list);
        Assertions.assertEquals(expected.length, list.size());
        Arrays.stream(expected).forEach(e -> Assertions.assertEquals(e, list.contains(e) ? e : actualLineage));
    }

    private String getActualLineage(List<String> lineages) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lineages.size(); i++) {
            result.append(lineages.get(i));
            if (i < lineages.size() - 1) {
                result.append("\n");
            }

        }
        return result.toString();
    }
}
