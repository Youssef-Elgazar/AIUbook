 package main;
import java.util.*;

public class Chat {
	Scanner console = new Scanner (System.in);
	//private ArrayList<String> messages  = new ArrayList<String>();
	static ArrayList<Message> messages  = new ArrayList<Message>();
	Chat(Profile sender, Profile reciever, ArrayList messages){
	
		Message.chooseReceiver(sender);
			Message.enterMessage()
		
	}

	public void sendMessage(Profile currentProfile, Profile user2, ArrayList messages) {
		System.out.println("(Uscita) to exit the chat and return to menu");
		System.out.println("Type a message:");
		String message = console.next();
		if(message.equals("Uscita")) {
			 User.showMainMenu(currentProfile);
		}else {
		messages.add(message);
		
	}

}
	
}