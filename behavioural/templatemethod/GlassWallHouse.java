package com.behavioural.templatemethod;

public class GlassWallHouse extends House {
	  @Override
	  public void decorateHouse() {
	    System.out.println("Decorating Glass Wall House");
	  }
	 
	  @Override
	  public void paintHouse() {
	    System.out.println("Painting Glass Wall House");
	  }
	 
	  @Override
	  public void constructDoors() {
	    System.out.println("Constructing Doors for Glass Wall House");
	  }
	 
	  @Override
	  public void constructWindows() {
	    System.out.println("Constructing Windows for Glass Wall House");
	  }
	 
	  @Override
	  public void constructWalls() {
	    System.out.println("Constructing Glass Wall for my House");
	  }
	}