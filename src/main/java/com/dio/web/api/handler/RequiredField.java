package com.dio.web.api.handler;

public class RequiredField extends BusinessException {
    public RequiredField(String field) {
        super("Field %s is required", field);
    }

    public RequiredField(String message, Object... params) {
        super(message, params);
    }
}
