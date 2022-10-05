package dev.cross.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@Table(name="products")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int rID;
	
	@Column(name="name")
	String name;
	
	@Column(name="price")
	int price;
	
	@Column(name="stock")
	int stock;

	public Product(Integer rID, String name, int price, int stock) {
		this.rID = rID;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public Integer getrID() {
		return rID;
	}

	public void setrID(Integer rID) {
		this.rID = rID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
}
