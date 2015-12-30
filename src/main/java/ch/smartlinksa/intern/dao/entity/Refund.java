package ch.smartlinksa.intern.dao.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="refund")
@DiscriminatorValue("3")
public class Refund extends Transaction {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String address;

    private String reason;

    @Column(name="total_price")
    private double totalPrice;

    public Refund() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}