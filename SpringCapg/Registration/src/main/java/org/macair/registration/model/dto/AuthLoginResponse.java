package org.macair.registration.model.dto;

public class AuthLoginResponse {
    private String username;
    private boolean success;

    public AuthLoginResponse() {
    }

    public AuthLoginResponse(String username, boolean success) {
        this.username = username;
        this.success = success;
    }

    @Override
    public String toString() {
        return "AuthLoginResponse{" +
                "username='" + username + '\'' +
                ", success=" + success +
                '}';
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
