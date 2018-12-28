package com.creditsaison.started.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("java","java name", "java description"),
			new Topic("c++","c++ name", "c++ description"),
			new Topic("spring","spring name", "spring description")
			));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}

	public Topic getTopic(String id) {
		for(int i=0;i<topics.size();i++) {
			if(topics.get(i).getId().equals(id)) {
				return topics.get(i);
			}
		}
		return null;
	}
	
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic)
	{
		for(int i=0;i<topics.size();i++)
		{
			if(topics.get(i).getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String id)
	{
		for(int i=0;i<topics.size();i++)
		{
			if(topics.get(i).getId().equals(id)) {
				topics.remove(i);
			}
		}
	}

}
