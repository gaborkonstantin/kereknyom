package com.spring.kereknyom.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError {

    private List<CustomFieldError> fieldErrors = new ArrayList<>();

    void addFieldError(String field, String message) {
        CustomFieldError error = new CustomFieldError(field, message);
        fieldErrors.add(error);
    }

    public List<CustomFieldError> getFieldErrors() {
        return fieldErrors;
    }

    public void setFieldErrors(List<CustomFieldError> customFieldErrors) {
        this.fieldErrors = customFieldErrors;
    }


    private static class CustomFieldError {

        private String field;
        private String message;

        CustomFieldError(String field, String message) {
            this.field = field;
            this.message = message;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
