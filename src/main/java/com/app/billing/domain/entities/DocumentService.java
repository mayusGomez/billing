/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.billing.domain.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agomez
 */
public class DocumentService {
    
    private Long id;
    private Long idDocument;
    private Double total;
    private Double balance;
    private List<DocumentServiceItem> items;
    
    public DocumentService(){
        
    }

    public DocumentService(Long id, Long idDocument, Double total, Double balance) {
        this.id = id;
        this.idDocument = idDocument;
        this.total = total;
        this.balance = balance;
        this.items = new ArrayList<>();
    }

    public DocumentService(Long idDocument, Double total, Double balance) {
        this.idDocument = idDocument;
        this.total = total;
        this.balance = balance;
        this.items = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(Long idDocument) {
        this.idDocument = idDocument;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<DocumentServiceItem> getItems() {
        return items;
    }

    public void setItems(List<DocumentServiceItem> items) {
        this.items = items;
    }
    
}
