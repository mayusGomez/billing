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
public class PaymentDistribution {
    
    private Long id;
    private Payment idPayment;
    private String reference; // Paymento to a bill, to an advance, to a financing, etc..
    private Long idReference;
    private Double value;

    public PaymentDistribution() {
    }

    public PaymentDistribution(Long id, Payment idPayment, String reference, Long idReference, Double value) {
        this.id = id;
        this.idPayment = idPayment;
        this.reference = reference;
        this.idReference = idReference;
        this.value = value;
    }

    public PaymentDistribution(Payment idPayment, String reference, Long idReference, Double value) {
        this.idPayment = idPayment;
        this.reference = reference;
        this.idReference = idReference;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Payment getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Payment idPayment) {
        this.idPayment = idPayment;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Long getIdReference() {
        return idReference;
    }

    public void setIdReference(Long idReference) {
        this.idReference = idReference;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DistributionPayment{" + "id=" + id + ", idPayment=" + idPayment + ", value=" + value + '}';
    }
    
}
