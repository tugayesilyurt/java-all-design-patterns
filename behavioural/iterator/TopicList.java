package com.behavioural.iterator;

public class TopicList implements List<Topic> {
	private Topic[] topics;

	public TopicList(Topic[] topics) {
		this.topics = topics;
	}

	@Override
	public Iterator<Topic> iterator() {
		return new TopicIterator(topics);
	}
}