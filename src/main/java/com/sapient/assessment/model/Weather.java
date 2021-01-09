package com.sapient.assessment.model;

import java.util.List;

public class Weather {

	public String cod;
	
	public String message;
	
	public String cnt;
	
	public List<WeatherInfo> list;
	
	public City city;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCnt() {
		return cnt;
	}

	public void setCnt(String cnt) {
		this.cnt = cnt;
	}

	public List<WeatherInfo> getList() {
		return list;
	}

	public void setList(List<WeatherInfo> list) {
		this.list = list;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
}
