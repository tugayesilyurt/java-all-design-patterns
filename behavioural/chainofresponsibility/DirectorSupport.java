package com.behavioural.chainofresponsibility;

public class DirectorSupport implements SupportServiceItf {
	 
	  private SupportServiceItf next = null;
	  public SupportServiceItf getNext() {
	    return next;
	  }
	  public void setNext(SupportServiceItf next) {
	    this.next = next;
	  }
	 
	  @Override
	  public void handleRequest(ServiceRequest request) {
	    if(request.getType() == ServiceLevel.LEVEL_FOUR)
	    {
	      request.setConclusion("Director solved level four reuqest !!");
	    }
	    else
	    {
	      if(next != null){
	        next.handleRequest(request);
	      }
	      else
	      {
	        request.setConclusion("You problem is none of our business");
	        throw new IllegalArgumentException("You problem is none of our business :: " + request.getType());
	      }
	    }
	  }
	}