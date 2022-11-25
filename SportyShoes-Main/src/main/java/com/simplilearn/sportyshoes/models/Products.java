package com.simplilearn.sportyshoes.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    private String description;

    private String imageName;


	 public void setImageName(String imageUUID) { 
		 
	 }


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageName() {
		return imageName;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", imageName=" + imageName + "]";
	}

	public Products(Long id, String name, double price, String description, String imageName) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageName = imageName;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	


}
