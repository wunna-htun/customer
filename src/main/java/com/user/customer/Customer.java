package com.user.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Active")
	private boolean active;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Customer(long id, String name, int age, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.active = active;
	}
	
	

}
