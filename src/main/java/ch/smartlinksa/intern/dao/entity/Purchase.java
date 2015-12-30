package ch.smartlinksa.intern.dao.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="purchase")
@DiscriminatorValue("2")
public class Purchase extends Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	private String address;

	private String id;

	@Column(name="total_price")
	private double totalPrice;

	public Purchase() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}