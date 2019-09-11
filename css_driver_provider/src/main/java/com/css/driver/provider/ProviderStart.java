package com.css.driver.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderStart {
	public static void main(String[] args) throws IOException {
		System.out.println("开启服务端");
		new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("服务端已开启");
		System.in.read();
	
	}

}
