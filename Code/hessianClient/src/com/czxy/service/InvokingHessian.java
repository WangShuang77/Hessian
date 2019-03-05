package com.czxy.service;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

public class InvokingHessian {
	public static void main(String[] args) throws Exception, ClassNotFoundException {
		// 调用HessianServer服务器端
		//1 创建调用工厂
		HessianProxyFactory proxy= new HessianProxyFactory();
		//2 请求远程预付
		IWeatherService ws = (IWeatherService)proxy.create("http://localhost:8088/hessianServer/hessian");
		//3像调用本地方法一样，调用远程方法
		String w = ws.getWeatherByCityname("沭阳");
		System.out.println(w);	
	}
}
