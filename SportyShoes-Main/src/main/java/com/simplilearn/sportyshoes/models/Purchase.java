package com.simplilearn.sportyshoes.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Purchase {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String firstName;
    
    @Column
    String lastName;

    @Column
    String product;

    @Column
    double price;

    @Column
    int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

	public Purchase(int id, String firstName, String lastName, String product, double price, int quantity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", product=" + product
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}





}
