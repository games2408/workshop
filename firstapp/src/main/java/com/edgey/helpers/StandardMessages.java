package com.edgey.helpers;

public class StandardMessages {
	private StandardMessages(){}
	
	private static String[] messageList = 
		{
				"Hello",
				"My",
				"Baby",
				"Hello",
				"My",
				"Honey"
		};
	
	public static String getMessage(int index){
		return messageList[index];
	}
	
	public static int getMessageListSize(){
		return messageList.length;
	}
}
