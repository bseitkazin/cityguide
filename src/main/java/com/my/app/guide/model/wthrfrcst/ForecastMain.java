package com.my.app.guide.model.wthrfrcst;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastMain {
	private double temp;
	@JsonProperty(value = "temp_min")
	private double tempMin;
	@JsonProperty(value = "temp_max")
	private double tempMax;
	private int pressure;
	@JsonProperty(value = "sea_level")
	private int seaLevel;
	@JsonProperty(value = "grnd_level")
	private int grndLevel;
	private int humidity;
	@JsonProperty(value = "temp_kf")
	private double tempKf;
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getTempMin() {
		return tempMin;
	}
	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}
	public double getTempMax() {
		return tempMax;
	}
	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getSeaLevel() {
		return seaLevel;
	}
	public void setSeaLevel(int seaLevel) {
		this.seaLevel = seaLevel;
	}
	public int getGrndLevel() {
		return grndLevel;
	}
	public void setGrndLevel(int grndLevel) {
		this.grndLevel = grndLevel;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public double getTempKf() {
		return tempKf;
	}
	public void setTempKf(double tempKf) {
		this.tempKf = tempKf;
	}
}
