package com.behavioural.observer;

public class ObserverMain {
	public static void main(String[] args) 
    {
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();
         
        MessagePublisher p = new MessagePublisher();
         
        p.attach(s1);
        p.attach(s2);
         
        p.notifyUpdate(new Message("First Message"));  
         
        p.detach(s1);
        p.attach(s3);
         
        p.notifyUpdate(new Message("Second Message")); 
    }
}
