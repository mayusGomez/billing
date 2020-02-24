/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.billing.domain.entities;

import com.app.billing.domain.types.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agomez
 */
public class Customer {
    private int id;
    private IdentificationType identificationType;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private List<Agreement> agreements;
    
    public Customer(){
        
    }
    
    public Customer(IdentificationType identificationType, String name, String lastName, 
            String email, String phone) {
        this.identificationType = identificationType;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.agreements = new ArrayList<>();
    }

    public Customer(int id, IdentificationType identificationType, String name, String lastName, String email, String phone) {
        this.id = id;
        this.identificationType = identificationType;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.agreements = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IdentificationType getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(IdentificationType identificationType) {
        this.identificationType = identificationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public List<Agreement> getAgreements() {
        return agreements;
    }

    public void setAgreements(List<Agreement> agreements) {
        this.agreements = agreements;
    }
    
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + '}';
    }
    
}
