package com.app.model;

public class User {
	private String username; 
	 private String password; 
	 private String address; 
	 private boolean receivePaper; 
	 private String[] favoriteFrameworks; 
	 private String gender; 
	 private String favoriteNumber; 
	 private String country;
	public User(String username, String password, String address, boolean receivePaper, String[] favoriteFrameworks,
			String gender, String favoriteNumber, String country) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.receivePaper = receivePaper;
		this.favoriteFrameworks = favoriteFrameworks;
		this.gender = gender;
		this.favoriteNumber = favoriteNumber;
		this.country = country;
	}
	public User() {
		// TODO Auto-generated constructor stub
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isReceivePaper() {
		return receivePaper;
	}
	public void setReceivePaper(boolean receivePaper) {
		this.receivePaper = receivePaper;
	}
	public String[] getFavoriteFrameworks() {
		return favoriteFrameworks;
	}
	public void setFavoriteFrameworks(String[] favoriteFrameworks) {
		this.favoriteFrameworks = favoriteFrameworks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFavoriteNumber() {
		return favoriteNumber;
	}
	public void setFavoriteNumber(String favoriteNumber) {
		this.favoriteNumber = favoriteNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	} 
	 
	 
	 

}
