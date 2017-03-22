package cn.com.commons.utils;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContext {

	public static AbstractApplicationContext context;
	
	static{
		if(context == null){
			load();
		}
	}
	
	public static void load(){
		if(context == null){
			context = new ClassPathXmlApplicationContext("spring/stand-alone.xml");
		}
	}
	
}
