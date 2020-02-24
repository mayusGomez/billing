/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.billing.domain.entities;

import java.util.Date;

/**
 *
 * @author agomez
 */
public class ServiceAgreement {
    private int id;
    private ServiceType serviceType;
    private Date initDate;
    private Date endDate;
    private Date dueDate;
    
    public ServiceAgreement() {
        
    }

    public ServiceAgreement(ServiceType serviceType, Date initDate, Date endDate, Date dueDate) {
        this.serviceType = serviceType;
        this.initDate = initDate;
        this.endDate = endDate;
        this.dueDate = dueDate;
    }

    public ServiceAgreement(int id, ServiceType serviceType, Date initDate, Date endDate, Date dueDate) {
        this.id = id;
        this.serviceType = serviceType;
        this.initDate = initDate;
        this.endDate = endDate;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "ServiceAggrement{" + "id=" + id + ", serviceType=" + serviceType + '}';
    }
    
}
