package ch.smartlinksa.intern.dao.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="refund")
@DiscriminatorValue("3")
public class RefundTransaction extends Transaction {
    private static final long serialVersionUID = 1L;

    private String address;

    private String reason;

    @Column(name="total_price")
    private double totalPrice;

    public RefundTransaction() {
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