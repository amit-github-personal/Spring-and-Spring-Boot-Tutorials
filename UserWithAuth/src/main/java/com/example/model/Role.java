package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Role_id")
	private Long role_id;
	
	@Column(name="Role_Name")
	private String role="admin";

	public Role() {
		super();
	}
	
	
	
	
	

}
