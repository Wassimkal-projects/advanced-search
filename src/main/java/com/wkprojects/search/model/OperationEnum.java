package com.wkprojects.search.model;

public enum OperationEnum {
    EQUAL,
    DIFFERENT,
    GREATER_THAN,
    LESS_THAN,
    LIKE;

    public static final String[] SIMPLE_OPERATION_SET = {":", "!", ">", "<", "~"};

    OperationEnum() {
    }

    public static OperationEnum getOperation(final char input) {
        switch (input) {
            case ':':
                return EQUAL;
            case '!':
                return DIFFERENT;
            case '>':
                return GREATER_THAN;
            case '<':
                return LESS_THAN;
            case '~':
                return LIKE;
            default:
                return null;
        }
    }
}
