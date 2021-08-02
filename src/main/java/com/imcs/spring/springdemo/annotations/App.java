package com.imcs.spring.springdemo.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
      context.register(AppConfig.class);
      context.refresh();
    	
      Plane plane = (Plane)context.getBean("plane");
      plane.setPlaneName("Annotations");
      
      System.out.println("Name - " + plane.getPlaneName());
      System.out.println("Route - "+ plane.getRoute());
    	
    	
    }
}
