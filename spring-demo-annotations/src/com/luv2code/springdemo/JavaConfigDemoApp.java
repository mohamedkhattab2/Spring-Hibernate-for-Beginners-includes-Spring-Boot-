package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// load spring configuration file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		// retrieve the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();

	}

}
