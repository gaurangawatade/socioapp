package com.socioapp.socioapp.entity;

import java.sql.Date;

public class User {
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String username;
	private String mobile;
	private String email;
	private String passwordHash;
	private Date registeredAt;
	private Date lastLogin;
	private String intro;
	private String profile;

	
	//Constructor
	public User(int id, String firstName, String middleName, String lastName, String username, String mobile,
			String email, String passwordHash, Date registeredAt, Date lastLogin, String intro, String profile) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.passwordHash = passwordHash;
		this.registeredAt = registeredAt;
		this.lastLogin = lastLogin;
		this.intro = intro;
		this.profile = profile;
	}
	
	//Getter Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public Date getRegisteredAt() {
		return registeredAt;
	}
	public void setRegisteredAt(Date registeredAt) {
		this.registeredAt = registeredAt;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
}
