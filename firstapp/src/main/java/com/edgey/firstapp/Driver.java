package com.edgey.firstapp;

import java.util.ArrayList;
import java.util.logging.*;
import com.edgey.helpers.*;

public class Driver {
	
	private Driver(){}

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		Logger logger = Logger.getLogger(Driver.class.getName());
		
		list.add("HELLO");
		list.add("MY BABY");
		list.add("HELLO");
		list.add("MY HONEY");
		
		for(String s:list){
			logger.info(s);
		}
		
		for(int i = 0; i < StandardMessages.getMessageListSize(); i++){
			logger.info(StandardMessages.getMessage(i));
		}
			
	}

}
