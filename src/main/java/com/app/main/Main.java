package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Robot;

public class Main
{
	public static void main(String[] args) {
		
	
	@SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	       Robot robot  =context.getBean("robot",Robot.class);
	       Robot robot1=context.getBean("robot1",Robot.class);
	       System.out.println(robot1);
	       System.out.println(robot);
	}
}
