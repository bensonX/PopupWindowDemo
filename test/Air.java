package com.yy.environmentalprotection.data.bean;

import java.io.Serializable;

public class Air implements Serializable {
	//test
	private String datatime;//监测时间
	private String pointname;//监测点
	private String aqi;//AQI
	private String airquality;//空气质量状况
	private String pollutant;//首要污染物
	public String getDatatime() {
		return datatime;
	}
	public void setDatatime(String datatime) {
		this.datatime = datatime;
	}
	public String getPointname() {
		return pointname;
	}
	public void setPointname(String pointname) {
		this.pointname = pointname;
	}
	public String getAqi() {
		return aqi;
	}
	public void setAqi(String aqi) {
		this.aqi = aqi;
	}
	public String getAirquality() {
		return airquality;
	}
	public void setAirquality(String airquality) {
		this.airquality = airquality;
	}
	public String getPollutant() {
		return pollutant;
	}
	public void setPollutant(String pollutant) {
		this.pollutant = pollutant;
	}
	
	
	
}
