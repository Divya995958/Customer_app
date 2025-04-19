package com.hcl.hsbc.customer.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_entity")
public class CustomerEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Customer_id")
    private Long id;
	@Column(name="Customer_Name")
    private String name;
	@Column(name="Customer_Email")
    private String email;
	public CustomerEntity(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public CustomerEntity() {
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", email=" + email + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
