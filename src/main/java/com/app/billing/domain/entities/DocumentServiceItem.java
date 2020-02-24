/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.billing.domain.entities;

import com.app.billing.domain.types.*;

/**
 *
 * @author agomez
 */
public class DocumentServiceItem {
    
    long id;
    Concept concept;
    Concept balanceConcept;
    float value;
    DocumentServiceItem docServiceItemTaxBase;  
    float taxBasePercentage;
    ItemType itemType;
    
}
