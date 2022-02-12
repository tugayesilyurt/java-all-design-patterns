package com.behavioural.chainofresponsibility;

public class ManagerSupport implements SupportServiceItf {
	 
	  private SupportServiceItf next = null;
	  public SupportServiceItf getNext() {
	    return next;
	  }
	  public void setNext(SupportServiceItf next) {
	    this.next = next;
	  }
	 
	  @Override
	  public void handleRequest(ServiceRequest request) {
	    if(request.getType() == ServiceLevel.LEVEL_THREE)
	    {
	      request.setConclusion("Manager solved level three reuqest !!");
	    }
	    else
	    {
	      if(next != null){
	        next.handleRequest(request);
	      }
	      else
	      {
	        throw new IllegalArgumentException("No handler found for :: " + request.getType());
	      }
	    }
	  }
	}