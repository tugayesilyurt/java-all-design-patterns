package com.behavioural.chainofresponsibility;

public class ChainOfResponsibilityMain {
	  public static void main(String[] args)
	  {
	    SupportService supportService = new SupportService();
	 
	    ServiceRequest request = new ServiceRequest();
	    request.setType(ServiceLevel.LEVEL_ONE);
	    supportService.handleRequest(request);
	    System.out.println(request.getConclusion());
	 
	    request = new ServiceRequest();
	    request.setType(ServiceLevel.LEVEL_THREE);
	    supportService.handleRequest(request);
	    System.out.println(request.getConclusion());
	 
	    request = new ServiceRequest();
	    request.setType(ServiceLevel.INVALID_REQUEST);
	    supportService.handleRequest(request);
	    System.out.println(request.getConclusion());
	  }
}
