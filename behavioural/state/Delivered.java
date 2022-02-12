package com.behavioural.state;

public class Delivered implements PackageState 
{
    //Singleton
    private static Delivered deliveredinstance = new Delivered();
 
    private Delivered() {}
 
    public static Delivered deliveredInstance() {
        return deliveredinstance;
    }
     
    //Business logic
    @Override
    public void updateState(DeliveryContext ctx) 
    {
        System.out.println("Package is delivered!!");
    }
}