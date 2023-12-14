package com.crni99.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Account {
	@Id
	private String username;
	private String password;
	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public Account() {
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}