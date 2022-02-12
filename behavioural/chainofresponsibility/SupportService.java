package com.behavioural.chainofresponsibility;

public class SupportService implements SupportServiceItf {
	 
	  private SupportServiceItf handler = null;
	 
	  public SupportServiceItf getHandler() {
	    return handler;
	  }
	 
	  public void setHandler(SupportServiceItf handler) {
	    this.handler = handler;
	  }
	 
	  @Override
	  public void handleRequest(ServiceRequest request) {
	    handler.handleRequest(request);
	  }
	}