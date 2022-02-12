package com.behavioural.state;

public class StateMain {
	public static void main(String[] args) 
    {
        DeliveryContext ctx = new DeliveryContext(null, "Test123");
         
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
