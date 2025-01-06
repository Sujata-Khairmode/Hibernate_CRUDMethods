package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentRecord")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	private long mobileNo;
	private String name;
	private String address;
	private int age;
	private String gender;
	
	
	public Student() {
		
	}
	
	
	
	
	public Student(long mobileNo, String name, String address, int age, String gender, int rollNo) {
		super();
		this.mobileNo = mobileNo;
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.rollNo = rollNo;
	}




	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Student [mobileNo=" + mobileNo + ", name=" + name + ", address=" + address + ", age=" + age
				+ ", gender=" + gender + ", rollNo=" + rollNo + "]";
	}
	
	

}
