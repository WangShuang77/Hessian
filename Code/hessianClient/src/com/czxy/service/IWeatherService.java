package com.czxy.service;

public interface IWeatherService {
	
	/**
	 * 根据城市名，返回天气预报
	 * @param cityname
	 * @return
	 */
	public String getWeatherByCityname(String cityname);	
	
}
