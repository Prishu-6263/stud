package com.studdata;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@Column(name="rollNo")
private  int rollNo;
	
	@Column(name="name")
private String name;
	
	@Column(name="address")
private String address;
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
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
public Student(int rollNo, String name, String address) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
}

}
