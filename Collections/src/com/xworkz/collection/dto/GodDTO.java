package com.xworkz.collection.dto;

import java.io.Serializable;

public class GodDTO implements Serializable,Comparable<GodDTO> {
	
	private String name;
	private String place;
	private String avatar;
	private String gender;
	private String specialPower;
	
	public GodDTO() {
		System.out.println("Running noparam const........");
	}
	public GodDTO(String name, String place, String avatar, String gender, String specialPower) {
		super();
		this.name = name;
		this.place = place;
		this.avatar = avatar;
		this.gender = gender;
		this.specialPower = specialPower;
	}
	
	
	@Override
	public String toString() {
		return "GodDTO [name=" + name + ", place=" + place + ", avatar=" + avatar + ", gender=" + gender
				+ ", specialPower=" + specialPower + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialPower() {
		return specialPower;
	}
	public void setSpecialPower(String specialPower) {
		this.specialPower = specialPower;
	}
	@Override
	public int compareTo(GodDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
