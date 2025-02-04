package com.br.erp.web.model.dto;

public class NewUserDTO {

    private String username;
    private String password;

    public NewUserDTO(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
