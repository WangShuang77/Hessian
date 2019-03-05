package com.czxy.service;

public class WeatherService implements IWeatherService{

	@Override
	public String getWeatherByCityname(String cityname) {
		if(cityname.equals("沭阳")){
			return "下美女";
		}else{
			return "下刀";
		}
		
	}
	
}
