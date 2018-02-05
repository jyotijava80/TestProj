package org.jyoti.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.jyoti.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages()
	{
		Message m1 = new Message(1L,"Hello world!","jyoti");
		Message m2 = new Message(1L,"Hello Jersey","jyoti");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}

}
