package com.my.app.guide.model;

import java.time.LocalDate;

import com.my.app.guide.model.weather.WeatherDTO;
import com.my.app.guide.model.wthrfrcst.WeatherForecastDTO;

public class WeatherCard{
	private String city;
	private WeatherDTO weather;
	private WeatherForecastDTO forecast;
	private LocalDate date;
	
	public WeatherCard(String city, WeatherDTO weather, WeatherForecastDTO forecast) {
		this.city = city;
		this.weather = weather;
		this.forecast = forecast;
		this.date = LocalDate.now();
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public WeatherDTO getWeather() {
		return weather;
	}
	public void setWeather(WeatherDTO weather) {
		this.weather = weather;
	}
	public WeatherForecastDTO getForecast() {
		return forecast;
	}
	public void setForecast(WeatherForecastDTO forecast) {
		this.forecast = forecast;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
