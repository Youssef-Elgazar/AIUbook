package main;
import java.util.*;

public class Chat {
	Scanner console = new Scanner (System.in);
	private ArrayList<String> messages  = new ArrayList<String>();
	
	Chat(Profile user1, Profile user2, ArrayList messages){
	System.out.println("Enter the user name you want to chat with");
	String reciever = console.next();
	for(int x = 0; x < User.allUsers.size(); x++) {
		if (reciever.equals(User.allUsers.get(x).getUserName())) {
			sendMessage(user1,user2,messages);
		}
	}
		System.out.println("Say Hi!");
		
	}

	public void sendMessage(Profile user1, Profile user2, ArrayList messages) {
		System.out.println("(Uscita) to exit the chat and return to menu");
		System.out.println("Type a message:");
		String message = console.next();
		if(message.equals("Uscita")) {
			 User.showMainMenu();
		}else {
		messages.add(message);
		
	}

}
	
}