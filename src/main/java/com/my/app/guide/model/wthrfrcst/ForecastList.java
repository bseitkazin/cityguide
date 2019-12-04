package com.my.app.guide.model.wthrfrcst;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastList {
	private int dt;
	private ForecastMain main;
	private List<ForecastWeather> weather;
	private ForecastCloud clouds;
	private ForecastWind wind;
	private ForecastSnow snow;
	@JsonProperty(value = "dt_txt")
	private String dtTxt;
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public ForecastMain getMain() {
		return main;
	}
	public void setMain(ForecastMain main) {
		this.main = main;
	}
	public List<ForecastWeather> getWeather() {
		return weather;
	}
	public void setWeather(List<ForecastWeather> weather) {
		this.weather = weather;
	}
	public ForecastCloud getClouds() {
		return clouds;
	}
	public void setClouds(ForecastCloud clouds) {
		this.clouds = clouds;
	}
	public ForecastWind getWind() {
		return wind;
	}
	public void setWind(ForecastWind wind) {
		this.wind = wind;
	}
	public ForecastSnow getSnow() {
		return snow;
	}
	public void setSnow(ForecastSnow snow) {
		this.snow = snow;
	}
	public String getDtTxt() {
		return dtTxt;
	}
	public void setDtTxt(String dtTxt) {
		this.dtTxt = dtTxt;
	}
}
