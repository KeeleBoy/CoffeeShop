package co.grandcircus.CoffeeShopLab.Objects;

import java.io.Serializable;

public class favorite implements Serializable {

	private static final long serialVersionUID = 1L;

	private Products product;
	private Long id;
	private String name;
	private String description;
	private Double price;
	private Double quantity;

	public Products getProduct() {
		return product;
	}

	public void setProducts(Products favorite) {
		this.product = favorite;
	}

	public Long getId() {
		return id;
	}

	public favorite() {

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
