/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.billing.domain.entities;

import java.util.Date;

import com.app.billing.domain.types.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agomez
 */
public class Agreement {
    private int id;
    private String description;
    private Status agreementStatus;
    private Date subscriptionDate;
    private Date SubscriptionCancelDate;
    private List<ServiceAgreement> serviceAgreements;
    private List<Document> documents;
    
    public Agreement () {
        
    }

    public Agreement(int id, String description, Status agreementStatus, Date subscriptionDate, Date SubscriptionCancelDate) {
        this.id = id;
        this.description = description;
        this.agreementStatus = agreementStatus;
        this.subscriptionDate = subscriptionDate;
        this.SubscriptionCancelDate = SubscriptionCancelDate;
        this.serviceAgreements = new ArrayList<>();
        this.documents = new ArrayList<>();
    }

    public Agreement(String description, Status agreementStatus, Date subscriptionDate, Date SubscriptionCancelDate) {
        this.description = description;
        this.agreementStatus = agreementStatus;
        this.subscriptionDate = subscriptionDate;
        this.SubscriptionCancelDate = SubscriptionCancelDate;
        this.serviceAgreements = new ArrayList<>();
        this.documents = new ArrayList<>();
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

    public Status getAgreementStatus() {
        return agreementStatus;
    }

    public void setAgreementStatus(Status agreementStatus) {
        this.agreementStatus = agreementStatus;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public Date getSubscriptionCancelDate() {
        return SubscriptionCancelDate;
    }

    public void setSubscriptionCancelDate(Date SubscriptionCancelDate) {
        this.SubscriptionCancelDate = SubscriptionCancelDate;
    }

    public List<ServiceAgreement> getServiceAgreements() {
        return serviceAgreements;
    }

    public void setServiceAgreements(List<ServiceAgreement> serviceAgreements) {
        this.serviceAgreements = serviceAgreements;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
    
    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", description=" + description + ", status="+ agreementStatus + '}';
    }
    
    
}
