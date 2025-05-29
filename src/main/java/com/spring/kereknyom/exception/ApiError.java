package com.spring.kereknyom.exception;

public class ApiError {

    private String errorCode;
    private String error;
    private String details;

    public ApiError(String errorCode, String error, String details) {
        this.errorCode = errorCode;
        this.error = error;
        this.details = details;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
