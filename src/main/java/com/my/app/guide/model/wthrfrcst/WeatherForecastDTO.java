package com.my.app.guide.model.wthrfrcst;

import java.util.List;

public class WeatherForecastDTO {
	private String cod;
	private String message;
	private int cnt;
	private List<ForecastList> list;
	private ForecastCity city;
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
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public List<ForecastList> getList() {
		return list;
	}
	public void setList(List<ForecastList> list) {
		this.list = list;
	}
	public ForecastCity getCity() {
		return city;
	}
	public void setCity(ForecastCity city) {
		this.city = city;
	}
}
