package org.jyoti.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jyoti.messenger.database.DatabaseClass;
import org.jyoti.messenger.model.Message;

public class MessageService {
	
	private  Map<Long, Message> messages= DatabaseClass.getMessages();
	public MessageService()
	{
		
		messages.put(1L, new Message(1,"Hello world!","jyoti"));
		messages.put(2L, new Message(2,"Hello Jersey","abcd"));
	}
	
	public List<Message> getAllMessages()
	{
		
		
	/*	Message m1 = new Message(1L,"Hello world!","jyoti");
		Message m2 = new Message(2L,"Hello Jersey","jyoti");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;*/
		return new ArrayList<Message>(messages.values());
		
	}
   
	 public Message getMessage(Long id)
	 {
		 return messages.get(id);
	 }
	 
	 public Message addMessage(Message  message)
	 {
		 message.setId(messages.size()+1);
		 messages.put(message.getId(), message);
		 return message;
		 
	 }
	 
	 public Message updateMessage(Message  message)
	 {
		if(message.getId() <= 0)
		{
			return null;
		}
		messages.put(message.getId(), message);
		return message;
		 
	 }
	 
	 public Message deleteMessage(Long id)
	 {
		 
		 return messages.remove(id);
		 
	 }
}
