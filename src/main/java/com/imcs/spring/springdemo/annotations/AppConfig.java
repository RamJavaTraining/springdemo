package com.imcs.spring.springdemo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.imcs.spring.springdemo.annotations")
public class AppConfig {
	
	
 @Bean(name = "plane")
 public Plane getPlane() {
	 return new Plane();
 }

 @Bean(name = {"routeChecker","routeChecker1"})
 public RouteChecker getRouteChecker() {
	 return new RouteChecker();
 }
}
