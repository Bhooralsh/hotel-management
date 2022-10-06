package com.hotel.entities;

import java.util.List;

public class Room {
	
	private String id;
	private String title;
	private double price;
	private int maxPeople;
	private List<RoomNumber>roomNumber;
	public Room() {
		super();
	}
	public Room(String id, String title, double price, int maxPeople, List<RoomNumber> roomNumber) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.maxPeople = maxPeople;
		this.roomNumber = roomNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMaxPeople() {
		return maxPeople;
	}
	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}
	public List<RoomNumber> getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(List<RoomNumber> roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", title=" + title + ", price=" + price + ", maxPeople=" + maxPeople + ", roomNumber="
				+ roomNumber + "]";
	}
	
	

}
