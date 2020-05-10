package com.wkprojects.search.model;

public class SearchValueOperationModel {

    OperationEnum operation;
    Object value;

    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
