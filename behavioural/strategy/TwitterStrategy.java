package com.behavioural.strategy;

public class TwitterStrategy implements ISocialMediaStrategy {
	 
	  public void connectTo(String friendName) 
	  {
	    System.out.println("Connecting with " + friendName + " through Twitter");
	  }
	}