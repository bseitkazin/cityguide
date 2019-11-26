package com.my.app.guide.model.weather;

import java.util.List;

public class WeatherDTO {
	private Coordinate coord;
	private List<Weather> weather;
	private String base;
	private Main main;
	private int visibility;
	private Cloud clouds;
	private int dt;
	private WeatherSystem sys;
	private int timezone;
	private int id;
	private String name;
	private int cod;
	
	public Coordinate getCoord() {
		return coord;
	}
	public void setCoord(Coordinate coord) {
		this.coord = coord;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	public Cloud getClouds() {
		return clouds;
	}
	public void setClouds(Cloud clouds) {
		this.clouds = clouds;
	}
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public WeatherSystem getSys() {
		return sys;
	}
	public void setSys(WeatherSystem sys) {
		this.sys = sys;
	}
	public int getTimezone() {
		return timezone;
	}
	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
}
