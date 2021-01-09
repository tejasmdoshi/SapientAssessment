package com.sapient.assessment.model;

import java.util.List;

public class WeatherInfo {

	private Long dt;

	private String dt_txt;

	private MainData main;

	private List<WeatherData> weather;

	private CloudsData clouds;

	private WindData wind;

	private SystemData sys;

	public Long getDt() {
		return dt;
	}

	public void setDt(Long dt) {
		this.dt = dt;
	}

	public String getDt_txt() {
		return dt_txt;
	}

	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}

	public MainData getMain() {
		return main;
	}

	public void setMain(MainData main) {
		this.main = main;
	}

	public List<WeatherData> getWeather() {
		return weather;
	}

	public void setWeather(List<WeatherData> weather) {
		this.weather = weather;
	}

	public CloudsData getClouds() {
		return clouds;
	}

	public void setClouds(CloudsData clouds) {
		this.clouds = clouds;
	}

	public WindData getWind() {
		return wind;
	}

	public void setWind(WindData wind) {
		this.wind = wind;
	}

	public SystemData getSys() {
		return sys;
	}

	public void setSys(SystemData sys) {
		this.sys = sys;
	}

}
