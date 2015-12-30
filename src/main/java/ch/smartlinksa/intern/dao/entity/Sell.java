package ch.smartlinksa.intern.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="sell")
@DiscriminatorValue("1")
public class Sell extends Transaction{
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String description;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
