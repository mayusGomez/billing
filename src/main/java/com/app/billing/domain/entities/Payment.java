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
public class Payment {
    private Long id;
    private String bank;
    private String sucursal;
    private Double value;
    private Date registrationDate;
    private Date paymentDate;
    private String distributionType;
    private Long coupon;    
    
    public Payment(){
        
    }

    public Payment(Long id, String bank, String sucursal, Double value, Date registrationDate, Date paymentDate, String distributionType, Long coupon) {
        this.id = id;
        this.bank = bank;
        this.sucursal = sucursal;
        this.value = value;
        this.registrationDate = registrationDate;
        this.paymentDate = paymentDate;
        this.distributionType = distributionType;
        this.coupon = coupon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(String distributionType) {
        this.distributionType = distributionType;
    }

    public Long getCoupon() {
        return coupon;
    }

    public void setCoupon(Long coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "Payment{" + "id=" + id + ", bank=" + bank + ", value=" + value + ", coupon=" + coupon + '}';
    }
    
}
