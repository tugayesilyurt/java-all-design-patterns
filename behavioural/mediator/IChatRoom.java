package com.behavioural.mediator;

public interface IChatRoom 
{
    public void sendMessage(String msg, String userId);
 
    void addUser(User user);
}
