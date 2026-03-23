package org.macair.registration.model.dto;

public class AuthSignupResponse {

    private String username;
    private boolean success;

    public AuthSignupResponse() {
    }

    public AuthSignupResponse(String username, boolean success) {
        this.username = username;
        this.success = success;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
