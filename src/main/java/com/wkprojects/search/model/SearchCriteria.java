package com.wkprojects.search.model;

public class SearchCriteria {

    private String key;
    private Object value;
    private OperationEnum operation;
    private Boolean orOperation;

    public SearchCriteria(String key, Object value, OperationEnum operation, Boolean orOperation) {
        this.key = key;
        this.value = value;
        this.operation = operation;
        this.orOperation = orOperation;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public Boolean getOrOperation() {
        return orOperation;
    }

    public void setOrOperation(Boolean orOperation) {
        this.orOperation = orOperation;
    }
}
