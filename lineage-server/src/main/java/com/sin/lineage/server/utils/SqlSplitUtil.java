package com.sin.lineage.server.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SqlSplitUtil {

    public static List<String> splitSql(String script) {
        List<String> statements = new ArrayList<>();
        StringBuilder currentStatement = new StringBuilder();

        boolean inBlockComment = false;
        boolean inLineComment = false;
        boolean inSingleQuote = false;
        boolean inDoubleQuote = false;
        boolean hasText = false;

        int length = script.length();
        for (int i = 0; i < length; i++) {
            char c = script.charAt(i);

            if (inBlockComment) {
                if (c == '*' && Objects.equals(peekNextChar(script, i), '/')) {
                    inBlockComment = false;
                    i++; // 跳过结束符号
                }
                continue;
            } else if (inLineComment) {
                if (c == '\n') {
                    inLineComment = false;
                }
                continue;
            } else if (inSingleQuote) {
                if (c == '\'') {
                    inSingleQuote = false;
                }
            } else if (inDoubleQuote) {
                if (c == '"') {
                    inDoubleQuote = false;
                }
            } else {
                if (c == '/' && peekNextChar(script, i) == '*') {
                    i++; // 跳过'*'
                    inBlockComment = true;
                    continue;
                } else if (c == '-' && peekNextChar(script, i) == '-') {
                    inLineComment = true;
                    continue;
                } else if (c == '\'') {
                    inSingleQuote = true;
                } else if (c == '"') {
                    inDoubleQuote = true;
                } else if (c == ';') {
                    String statement = currentStatement.toString().trim();
                    if (!statement.isEmpty()) {
                        statements.add(statement);
                    }
                    currentStatement.setLength(0);
                    hasText = false;
                    continue;
                }
            }

            if (!inBlockComment && !inLineComment) {
                if (Character.isWhitespace(c)) {
                    if (hasText) {
                        currentStatement.append(' ');
                    }
                    // 跳过后续的空白字符
                    while (i + 1 < length && Character.isWhitespace(script.charAt(i + 1))) {
                        i++;
                    }
                } else {
                    currentStatement.append(c);
                    hasText = true;
                }
            }
        }

        // 处理最后一个语句（没有分号结尾的情况）
        String remaining = currentStatement.toString().trim();
        if (!remaining.isEmpty()) {
            statements.add(remaining);
        }

        return statements;
    }

    private static Character peekNextChar(String script, int currentIndex) {
        if (currentIndex + 1 >= script.length()) {
            return null;
        }
        return script.charAt(currentIndex + 1);
    }
}
