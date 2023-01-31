package com.example.a20230131_glennwhite_nycschools.model.state;

public class ERROR extends UIState {
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
