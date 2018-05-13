package com.springbootdemo.example.springbootdemo;

public class Restaurant {
	String resName;
	String resAddress;
	String resPhn;
	String resCity;

	public Restaurant(String resName, String resAddress, String resPhn, String resCity) {
		super();
		this.resName = resName;
		this.resAddress = resAddress;
		this.resPhn = resPhn;
		this.resCity = resCity;
	}

	public String getResName() {
		return resName;
	}

	public String getResAddress() {
		return resAddress;
	}

	public String getResPhn() {
		return resPhn;
	}

	public String getResCity() {
		return resCity;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public void setResAddress(String resAddress) {
		this.resAddress = resAddress;
	}

	public void setResPhn(String resPhn) {
		this.resPhn = resPhn;
	}

	public void setResCity(String resCity) {
		this.resCity = resCity;
	}

}
