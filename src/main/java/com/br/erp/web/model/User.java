package com.br.erp.web.model;

import com.br.erp.web.types.Role;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles = new HashSet<>();

    @Column(name = "firstAccess")
    private Boolean firstAccess = true;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "regitrationDate")
    private Date regitrationDate;

    public User(){}

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

    public boolean isFirstAccess() {
        return firstAccess;
    }

    public void setFirstAccess(Boolean firstAccess) {
        this.firstAccess = firstAccess;
    }

    public Boolean getFirstAccess() {
        return firstAccess;
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
