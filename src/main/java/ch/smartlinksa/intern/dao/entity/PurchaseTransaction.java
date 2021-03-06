package ch.smartlinksa.intern.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="purchase_transaction")
@DiscriminatorValue("1")
public class PurchaseTransaction extends Transaction {

	private static final long serialVersionUID = 1L;

	private String address;

	@Column(name="total_price")
	private double totalPrice;

	public PurchaseTransaction() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}