package main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Message {
	File file = new File ("MessageContent.txt");
	static String content;
	Profile sender;
	Profile reciever ;
	
	
	public void enterMessage(String content,Profile sender, Profile reciever ) {
	
		System.out.println("Enter content");
		Scanner console = new Scanner (System.in);
		System.out.println("Type a message..");
		String msgcontent = console.next();
		try {
			//writing file
		
		PrintWriter output = new PrintWriter(file);
		
		output.println(content);
		output.close();
		} catch (IOException ex ) {
			System.out.printf("Error ", ex);
		}
}

	public void chooseReceiver() {
		Scanner console = new Scanner (System.in);
		String toRecieve = console.next();
				for(int x = 0; x < User.allUsers.size(); x++) {
					if (toRecieve.equals(User.allUsers.get(x).getUserName())) {
					Profile reciever = User.allUsers.get(x);
	}


	}

	
	}		 
	}
			
			
		 
	

