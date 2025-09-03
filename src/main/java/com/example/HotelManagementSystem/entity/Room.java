package com.example.HotelManagementSystem.entity;

import com.example.HotelManagementSystem.Enum.RoomStatus;
import com.example.HotelManagementSystem.Enum.RoomType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "room_details")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roomId;
	
	@Column(name = "room_number")
	private String roomNumber;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private RoomType roomType;
	
	@Column(name = "room_price")
	private Double roomPrice;
	
	@Column(name = "room_capacity")
	private Integer roomCapacity;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "room_status")
	private RoomStatus roomStatus;
	
	@Column(name = "created_at", updatable = false)
	private String createdAt;
	

	public Room() {
		super();
	}

	public Room(Integer roomId, String roomNumber, RoomType roomType, Double roomPrice, Integer roomCapacity,
			RoomStatus roomStatus, String createdAt) {
		super();
		this.roomId = roomId;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomCapacity = roomCapacity;
		this.roomStatus = roomStatus;
		this.createdAt = createdAt;
	}
	
	

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public Double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public Integer getRoomCapacity() {
		return roomCapacity;
	}

	public void setRoomCapacity(Integer roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public RoomStatus getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(RoomStatus roomStatus) {
		this.roomStatus = roomStatus;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomNumber=" + roomNumber + ", roomType=" + roomType + ", roomPrice="
				+ roomPrice + ", roomCapacity=" + roomCapacity + ", roomStatus=" + roomStatus + ", createdAt="
				+ createdAt + "]";
	}
	
	
	

	

}
