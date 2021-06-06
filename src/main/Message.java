package main;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Message {
	
	static String content;
	static Profile sender;
	static Profile reciever ;
//
//	FileOutputStream fo = new FileOutputStream(file);	
//	ObjectOutputStream output = new ObjectOutputStream(fo)
	
	
	public Message(Profile user1,Profile reciever,String content) {
		this.sender =sender;
		this.reciever = reciever;
		this.content = content;
	}
	
	public void enterMessage(String content,Profile sender, Profile reciever ) throws IOException {

		File file = new File ("MessageContent.txt");

		Scanner console = new Scanner (System.in);
		System.out.println("Type a message..");
		String msgcontent = console.next();
		if (msgcontent.equals("Uscita")) {
			 User.showMainMenu(sender);
		}else {
		
		FileOutputStream fo = new FileOutputStream(file);	
		ObjectOutputStream output = new ObjectOutputStream(fo);
	
		Chat.messages.add(new Message(sender, reciever, msgcontent));
		
		for (Message s :	Chat.messages ) {
			output.writeObject(s);
		}
	
		}
	}
	public static void chooseReceiver(Profile sender) {
		Scanner console = new Scanner (System.in);
		String toRecieve = console.next();
				for(int x = 0; x < User.allUsers.size(); x++) {
					if (toRecieve.equals(User.allUsers.get(x).getUserName())) {
					Profile reciever = User.allUsers.get(x);
	}


	}

	
	}		 
	}

			
		 
	

