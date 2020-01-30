/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.cgesp.org.providerTest.models;

import javax.persistence.Entity;

/**
 *
 * @author Lucas
 */
@Entity
public class Record extends AbstractEntity {

    private String zone, neighborhood, street, startDT, endDT, direction,
            reference, status;

    public Record() {
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStartDT() {
        return startDT;
    }

    public void setStartDT(String startDT) {
        this.startDT = startDT;
    }

    public String getEndDT() {
        return endDT;
    }

    public void setEndDT(String endDT) {
        this.endDT = endDT;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
