package com.imcs.spring.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;


@Scope("singleton")
public class Plane {
	
	
	private String planeName;
	private RouteChecker routeChecker;
	
	
	public Plane() {
	}
	
//	public Plane(RouteChecker routeChecker) {
//		this.routeChecker= new RouteChecker();
//	}
	
	
	
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public RouteChecker getRouteChecker() {
		return routeChecker;
	}
	@Autowired
	@Qualifier("routeChecker1")
	public void setRouteChecker(RouteChecker routeChecker) {
		this.routeChecker = routeChecker;
	}
	
	public String getRoute() {
		
		return routeChecker.getRoute();
	}
	

}
