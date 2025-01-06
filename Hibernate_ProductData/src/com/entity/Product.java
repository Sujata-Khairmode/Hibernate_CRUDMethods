package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productrecords")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int p_id;
	@Column(name="productName")
	public String name;
	public String companyName;
	public float wgt;
	public long price;
	
	public Product() {
		
	}
	public Product(String name, int p_id, String companyName, float wgt, long price) {
		super();
		this.name = name;
		this.p_id = p_id;
		this.companyName = companyName;
		this.wgt = wgt;
		this.price = price;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getWgt() {
		return wgt;
	}
	public void setWgt(float wgt) {
		this.wgt = wgt;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", p_id=" + p_id + ", companyName=" + companyName + ", wgt=" + wgt + ", price="
				+ price + "]";
	}
	
	
}
