package com.groupten.employ.secuirty;

import org.apache.shiro.authc.AuthenticationToken;

public class CustomAccountToken implements AuthenticationToken {
    private String role;
    private String username;
    private Boolean rememberMe = false;
    private char[] password;
    private String host;

    @Override
    public Object getPrincipal() {
        return getUsername();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public char[] getCredentials() {
        return getPassword();
    }

    public CustomAccountToken(String role, String username, String password) {
        this.role = role;
        this.username = username;
        this.password = password.toCharArray();
    }
}
