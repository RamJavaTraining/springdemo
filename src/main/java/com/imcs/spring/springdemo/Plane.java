package com.imcs.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Plane {
	
	
	private String planeName;
	private RouteChecker routeChecker;
	
	public Plane() {
		//routeChecker= new RouteChecker();
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

	public void setRouteChecker(RouteChecker routeChecker) {
		this.routeChecker = routeChecker;
	}
	
	public String getRoute() {
		
		return routeChecker.getRoute();
	}
	

}
