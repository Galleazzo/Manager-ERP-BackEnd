package com.br.erp.web.model.dto;

import com.br.erp.web.types.Role;
import jakarta.persistence.Column;

import java.util.Date;
import java.util.Set;

public class UserDTO {

    private Long id;
    private String username;
    private Set<Role> roles;
    private Boolean firstAccess;
    private String email;
    private String name;
    private Date regitrationDate;

    public UserDTO() {}

    public UserDTO(Long id, String username, Set<Role> roles) {
        this.id = id;
        this.username = username;
        this.roles = roles;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Boolean getFirstAccess() {
        return firstAccess;
    }

    public void setFirstAccess(Boolean firstAccess) {
        this.firstAccess = firstAccess;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegitrationDate() {
        return regitrationDate;
    }

    public void setRegitrationDate(Date regitrationDate) {
        this.regitrationDate = regitrationDate;
    }
}
