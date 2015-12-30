package ch.smartlinksa.intern.dao.entity;

import ch.smartlinksa.intern.dao.constant.TypeOfTransaction;

import javax.persistence.*;

@Entity
@Table(name="sell_transaction")
@DiscriminatorValue(TypeOfTransaction.SELL)
public class SellTransaction extends Transaction{
    private static final long serialVersionUID = 1L;

    private String description;
    public String address;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
