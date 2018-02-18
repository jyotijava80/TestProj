package com.jyoti.designPattern.Mediator;
import java.util.Date;


public class Chatroom {
 
	 public static void showMessage(User user, String message)
	 {
		 
		 System.out.println(new Date().toString()+"---User name: "+ user.getName() + ":  "+ message);
	 }
}
