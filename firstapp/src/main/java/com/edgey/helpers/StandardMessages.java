package com.edgey.helpers;

public class StandardMessages {
	
	private static String[] messageList = 
		{
				"Hello",
				"My",
				"Baby",
				"Hello",
				"My",
				"Honey"
		};
	
	private StandardMessages(){}
	
	public static String getMessage(int index){
		return messageList[index];
	}
	
	public static int getMessageListSize(){
		return messageList.length;
	}
}
