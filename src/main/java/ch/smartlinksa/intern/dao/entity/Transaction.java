package ch.smartlinksa.intern.dao.entity;

import ch.smartlinksa.intern.dao.constant.TypeOfTransaction;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="transaction")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="type_of_transaction", discriminatorType=DiscriminatorType.INTEGER)
public class Transaction extends AbstractAuditableEntity {
    private static final long serialVersionUID = 1L;

    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name="product_code")
    private String productCode;

    private int quantity;

    @Column(name="result_code")
    private String resultCode;

    @Column(name="result_message")
    private String resultMessage;

    @Column(name="unit_price")
    private double unitPrice;

    @Column(name="type_of_transaction", insertable = false, updatable = false)
    private TypeOfTransaction typeOfTransaction;

    //bi-directional many-to-one association to User
    @ManyToOne
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TypeOfTransaction getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(TypeOfTransaction typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }
}