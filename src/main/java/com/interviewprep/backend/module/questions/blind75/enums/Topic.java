package com.interviewprep.backend.module.questions.blind75.enums;

public enum Topic {
    ARRAYS, STRINGS, TREES, GRAPHS, DYNAMIC_PROGRAMMING, BINARY_SEARCH,
    LINKED_LIST, MATRIX, HEAP, INTERVAL, BIT_MANIPULATION, SLIDING_WINDOW,
    STACK, TRIE;

    public static String[] topicNames() {
        return java.util.Arrays.stream(values()).map(Enum::name).toArray(String[]::new);
    }
}
