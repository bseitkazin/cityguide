package com.my.app.guide.model.wthrfrcst;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastSnow {
	@JsonProperty(value = "3h")
	private double val;

	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}
}
