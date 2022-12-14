package com.hotel.entities;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private String id;
	private String name;
	private String type;
	private String city;
	private String address;
	private String distance;
	private ArrayList<String> photo;
	private String title;
	private int rating;
	private List<Room> rooms;
	private double cheapsetPrice;
	private boolean featured;

	public Hotel() {
		super();
	}

	public Hotel(String id, String name, String type, String city, String address, String distance,
			ArrayList<String> photo, String title, int rating, List<Room> rooms, double cheapsetPrice,
			boolean featured) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.city = city;
		this.address = address;
		this.distance = distance;
		this.photo = photo;
		this.title = title;
		this.rating = rating;
		this.rooms = rooms;
		this.cheapsetPrice = cheapsetPrice;
		this.featured = featured;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public ArrayList<String> getPhoto() {
		return photo;
	}

	public void setPhoto(ArrayList<String> photo) {
		this.photo = photo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRating() {

		return rating;

	}

	public void setRating(int rating) {

		if (rating>=0 &&rating<=5) {
			this.rating = rating;
		} 
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public double getCheapsetPrice() {
		return cheapsetPrice;
	}

	public void setCheapsetPrice(double cheapsetPrice) {
		this.cheapsetPrice = cheapsetPrice;
	}

	public boolean isFeatured() {
		return featured;
	}

	public void setFeatured(boolean featured) {
		this.featured = featured;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", type=" + type + ", city=" + city + ", address=" + address
				+ ", distance=" + distance + ", photo=" + photo + ", title=" + title + ", rating=" + rating + ", rooms="
				+ rooms + ", cheapsetPrice=" + cheapsetPrice + ", featured=" + featured + "]";
	}

}
