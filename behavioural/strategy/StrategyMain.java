package com.behavioural.strategy;

public class StrategyMain {
	  public static void main(String[] args) {

		    SocialMediaContext context = new SocialMediaContext();
		 

		    context.setSocialmediaStrategy(new FacebookStrategy());
		    context.connect("Lokesh");
		 
		    System.out.println("====================");
		 

		    context.setSocialmediaStrategy(new TwitterStrategy());
		    context.connect("Lokesh");
		 
		    System.out.println("====================");
		 

		    context.setSocialmediaStrategy(new GooglePlusStrategy());
		    context.connect("Lokesh");
		 
		    System.out.println("====================");

		  }
}
