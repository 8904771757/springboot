package io.javabrains.springbootstarter.topic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



 @RestController
public class TopicControlerJava {
	
	 
	 @Autowired	
	 	private topicService TopicService;
 
	 	@RequestMapping("/topics")
	 		public List<Topic> getAllTopics() {
	 		return topicService.getAllTopics();
	}
	 	@requestMapping("/topics/id")
	 	public Topic getTopic(@PathVariable String id) {
	 		return topicService.getTopi(id);
	 	}
	 @requestMapping(method=RequestMethod.POST,value="/topics")
	 public void addtopic(@RequestBody topic Topic) {
		 topicService.addTopic(Topic);
	 }
	 @requestMapping(method=RequestMethod.PUT,value="/topics/id")
	 public void updatetopic(@RequestBody topic Topic,PathVariable String id) {
		 topicService.updateTopic(id,Topic);
	 } 
	 @requestMapping(method=RequestMethod.DELETE,value="/topics/id")
	 public void deletetopic(@PathVariable String id) {
		 topicService.deleteTopic(id);
	 }
}

 
 
 
 
 
 
 
 
 
 
 
 
 