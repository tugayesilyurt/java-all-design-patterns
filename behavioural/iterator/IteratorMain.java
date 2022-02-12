package com.behavioural.iterator;

public class IteratorMain {
	 public static void main(String[] args) 
	  {
	    Topic[] topics = new Topic[5];
	    topics[0] = new Topic("topic1");
	    topics[1] = new Topic("topic2");
	    topics[2] = new Topic("topic3");
	    topics[3] = new Topic("topic4");
	    topics[4] = new Topic("topic5");
	     
	    List<Topic> list = new TopicList(topics);
	     
	    Iterator<Topic> iterator = list.iterator();
	     
	    while(iterator.hasNext()) {
	      Topic currentTopic = iterator.next();
	      System.out.println(currentTopic.getName());
	    }
	  }
}
