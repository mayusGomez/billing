/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.billing.domain.entities;

/**
 *
 * @author agomez
 */
public class ServiceType {
    private int id;
    private String description;
    
    public ServiceType() {
        
    }

    public ServiceType(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ServiceType{" + "id=" + id + ", description=" + description + '}';
    }
    
}
