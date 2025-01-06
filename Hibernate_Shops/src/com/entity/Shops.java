package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shoprecords")
public class Shops {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String s_name;
	@Column(name="product name")
	public String p_name;
	public String Address;
	
	public Shops() {
		
	}
	
	public Shops(int id, String s_name, String p_name, String address) {
		super();
		this.id = id;
		this.s_name = s_name;
		this.p_name = p_name;
		Address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Shops [id=" + id + ", s_name=" + s_name + ", p_name=" + p_name + ", Address=" + Address + "]";
	}
	
	

}
