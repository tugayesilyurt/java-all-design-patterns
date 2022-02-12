package com.behavioural.mediator;

public class MediatorMain {
	 public static void main(String[] args) 
	    {
	        IChatRoom chatroom = new ChatRoom();
	         
	        User user1 = new ChatUser(chatroom,"1", "Tugay");
	        User user2 = new ChatUser(chatroom,"2", "Yesilyurt");
	        User user3 = new ChatUser(chatroom,"3", "Huseyin");
	        User user4 = new ChatUser(chatroom,"4", "Kemal");
	         
	        chatroom.addUser(user1);
	        chatroom.addUser(user2);
	        chatroom.addUser(user3);
	        chatroom.addUser(user4);
	 
	        user1.send("Hello Huseyn", "3");
	        user3.send("Hey buddy", "1");
	    }
}
