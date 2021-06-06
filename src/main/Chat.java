package main;

import java.io.IOException;
import java.util.*;

public class Chat {
	static ArrayList<Message> messages = new ArrayList<Message>();
	private Profile userOne;
	private Profile userTwo;

	Chat(Profile user1, Profile user2) {
		this.userOne = user1;
		this.userTwo = user2;
	}

	public static void chooseReceiver(Profile sender) {
		Scanner console = new Scanner(System.in);
		Profile receiver = null;

		System.out.println("Who do you want to chat with? (Enter username...)");
		String receiverName = console.next();

		for (int x = 0; x < User.allUsers.size(); x++) {
			if (receiverName.equals(User.allUsers.get(x).getUserName())) {
				receiver = User.allUsers.get(x);
			}
		}
		sendMessage(sender, receiver);
	}

	public static void sendMessage(Profile sender, Profile receiver) {
		Scanner console = new Scanner(System.in);
		System.out.println("Type a message..");
		String messgContent = console.next();
		
		if (messgContent.equals("Uscita") || messgContent.equals("uscita")) {
			User.showMainMenu(sender);
		} else {
			Chat.messages.add(new Message(sender, receiver, messgContent));
		}
	}

}