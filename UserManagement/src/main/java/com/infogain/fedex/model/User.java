package com.infogain.fedex.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table
@XmlRootElement
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String desig;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String desig) {
		super();
		this.name = name;
		this.desig = desig;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", desig=" + desig + "]";
	}	
}
