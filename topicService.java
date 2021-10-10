package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class topicService {

	private List<Topic>topics=new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Framework Description"),
			new Topic("Java","Core Java","Java Description"),
			new Topic("JavaScript","JavaScript","JavaScript Description")
			));
	public List<Topic> getAlltopics(){
		return topics;
	}
	public topic getTopic(String id) {
		return topic.Stream().filter(t ->t.getid().equals(id)).findFirst().get();
	}
	public void addTopic(topic Topic) {
		topic.add(topic;)
	}
	public void updateTopic(String id,topic id) {
		for(int i=0;i<topics.size();i++{
			Topic t=topics.get(i);
		if(t.getId().equals(id)) {
			topics.set(i, topic);
			return;
		}
		}
}
	public static void deleteTopic(String id) {
		topic.removeif(t -> t.getid().equals(id));
		
	}
}
	
	
	
	
	
	
	