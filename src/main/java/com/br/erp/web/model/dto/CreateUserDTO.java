package com.br.erp.web.model.dto;

import com.br.erp.web.types.Role;

import java.util.Set;

public class CreateUserDTO {

    private String username;
    private String password;
    private Set<Role> roles;

    public CreateUserDTO() {}

    public CreateUserDTO(String username, String password, Set<Role> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    // Getters and setters
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
