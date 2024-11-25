package com.br.erp.web.model.dto;

import java.util.List;

public class ClientDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;

    private List<ProductDTO> purchasedProducts; // List of products purchased by the client
    private List<ServiceDTO> requestedServices; // List of services requested by the client

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String email, String phone, List<ProductDTO> purchasedProducts, List<ServiceDTO> requestedServices) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.purchasedProducts = purchasedProducts;
        this.requestedServices = requestedServices;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<ProductDTO> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(List<ProductDTO> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public List<ServiceDTO> getRequestedServices() {
        return requestedServices;
    }

    public void setRequestedServices(List<ServiceDTO> requestedServices) {
        this.requestedServices = requestedServices;
    }
}
