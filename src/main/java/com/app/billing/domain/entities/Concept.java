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
public class Concept {
    
    private int id;
    private String description;
    private boolean isNegative;
    private boolean isTax;
    
    public Concept(){
        
    }

    public Concept(String description, boolean isNegative, boolean isTax) {
        this.description = description;
        this.isNegative = isNegative;
        this.isTax = isTax;
    }

    public Concept(int id, String description, boolean isNegative, boolean isTax) {
        this.id = id;
        this.description = description;
        this.isNegative = isNegative;
        this.isTax = isTax;
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

    public boolean isIsNegative() {
        return isNegative;
    }

    public void setIsNegative(boolean isNegative) {
        this.isNegative = isNegative;
    }

    public boolean isIsTax() {
        return isTax;
    }

    public void setIsTax(boolean isTax) {
        this.isTax = isTax;
    }
    
    

    @Override
    public String toString() {
        return "Concept{" + "id=" + id + ", description=" + description + '}';
    }
    
    
}
