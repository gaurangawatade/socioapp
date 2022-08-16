package com.socioapp.socioapp.entity;

import java.sql.Date;

public class Post {
	
	private int id;
	private int userId;
	private int senderId;
	private String message;
	private Date createdAt;
	private Date updatedAt;
	
	
	
	public Post(int id, int userId, int senderId, String message, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.senderId = senderId;
		this.message = message;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getSenderId() {
		return senderId;
	}
	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}



	@Override
	public String toString() {
		return "Post [id=" + id + ", userId=" + userId + ", senderId=" + senderId + ", message=" + message
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	

}
