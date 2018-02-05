package org.jyoti.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jyoti.messenger.model.Message;
import org.jyoti.messenger.service.MessageService;

@Path("/messages")  //first annotation
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET //second annotation
	@Produces(MediaType.APPLICATION_XML) //third annotation
	public List<Message>  getMessages()
	{
		//return "hello World restful example";
		return messageService.getAllMessages();
	}

}
