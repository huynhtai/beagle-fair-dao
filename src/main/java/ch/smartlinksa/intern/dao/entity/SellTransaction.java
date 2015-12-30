package ch.smartlinksa.intern.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="sell")
@DiscriminatorValue("1")
public class SellTransaction extends Transaction{
    private static final long serialVersionUID = 1L;

    private String description;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
