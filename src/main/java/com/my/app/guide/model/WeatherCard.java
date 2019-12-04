package com.my.app.guide.model;

import com.my.app.guide.model.weather.WeatherDTO;
import com.my.app.guide.model.wthrfrcst.WeatherForecastDTO;

public class WeatherCard {
	private String city;
	private WeatherDTO weather;
	private WeatherForecastDTO forecast;
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
}
