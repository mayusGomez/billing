/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.billing.domain.entities;

import com.app.billing.domain.types.DocumentType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author agomez
 */
public class Document {
    private int id;    
    private DocumentType documentType;
    private String prefix;
    private int sequence;
    private long total;
    private long balance;
    private Date generationDate;
    private Date documentDate;
    private Date dueDate;
    private Date initialDueDate;
    private Employee employee;
    private List<DocumentService> documentService;
    
    
    public Document(){
        
    }

    public Document(DocumentType documentType, String prefix, int sequence, long total, long balance, 
            Date generationDate, Date documentDate, Date dueDate, Date initialDueDate, Employee employee) {
        this.documentType = documentType;
        this.prefix = prefix;
        this.sequence = sequence;
        this.total = total;
        this.balance = balance;
        this.generationDate = generationDate;
        this.documentDate = documentDate;
        this.dueDate = dueDate;
        this.initialDueDate = initialDueDate;
        this.employee = employee;
        this.documentService = new ArrayList<>();
    }

    public Document(int id, Agreement idAccount, DocumentType documentType, String prefix, int sequence, 
            long total, long balance, Date generationDate, Date documentDate, Date dueDate, Date initialDueDate, Employee employee) {
        this.id = id;
        this.documentType = documentType;
        this.prefix = prefix;
        this.sequence = sequence;
        this.total = total;
        this.balance = balance;
        this.generationDate = generationDate;
        this.documentDate = documentDate;
        this.dueDate = dueDate;
        this.initialDueDate = initialDueDate;
        this.employee = employee;
        this.documentService = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Date getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(Date generationDate) {
        this.generationDate = generationDate;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getInitialDueDate() {
        return initialDueDate;
    }

    public void setInitialDueDate(Date initialDueDate) {
        this.initialDueDate = initialDueDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<DocumentService> getDocumentService() {
        return documentService;
    }

    public void setDocumentService(List<DocumentService> documentService) {
        this.documentService = documentService;
    }

    @Override
    public String toString() {
        return "Document{" + "id=" + id + ", documentType=" + documentType + ", prefix=" + prefix + ", sequence=" + sequence + ", total=" + total + '}';
    }
    
    
    
}
