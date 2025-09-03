package com.example.HotelManagementSystem.entity;

import com.example.HotelManagementSystem.Enum.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin_details")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminId;
	
	private User user;
	
	@Column(name = "admin_email")
	private String adminEmail;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private UserRole adminRole;
	
	@Column(name = "created_at", updatable = false)
	private String createdAt;
	

	public Admin() {
		super();
	}

	public Admin(Integer adminId, User user, String adminEmail, UserRole adminRole, String createdAt) {
		super();
		this.adminId = adminId;
		this.user = user;
		this.adminEmail = adminEmail;
		this.adminRole = adminRole;
		this.createdAt = createdAt;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public UserRole getAdminRole() {
		return adminRole;
	}

	public void setAdminRole(UserRole adminRole) {
		this.adminRole = adminRole;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", user=" + user + ", adminEmail=" + adminEmail + ", adminRole="
				+ adminRole + ", createdAt=" + createdAt + "]";
	}


}
