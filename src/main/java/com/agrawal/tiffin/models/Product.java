package com.agrawal.tiffin.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

	private String productName;
	private String description;
	private Double price;
	private Double discountPercent;

	private String productType;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", description=" + description + ", price=" + price
				+ ", discountPercent=" + discountPercent + ", productType=" + productType + "]";
	}
	
	
}
