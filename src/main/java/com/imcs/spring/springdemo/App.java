package com.imcs.spring.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       RouteChecker routeChecker = new RouteChecker();
//       Plane plane = new Plane();
//       plane.setRouteChecker(routeChecker);
//       System.out.println("Route is - "+ plane.getRoute());
    	
     ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
      Plane plane = (Plane)context.getBean("plane");
      
      System.out.println("Name - " + plane.getPlaneName());
      System.out.println("Route - "+ plane.getRoute());
    	
    	
    }
}
