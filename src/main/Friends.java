package main;

import java.util.ArrayList;

public class Friends {
	private ArrayList <UserAccount> friends = new ArrayList <UserAccount>();  
	private ArrayList <UserAccount> following = new ArrayList <UserAccount>();  
	
	public void addFriend(UserAccount newFriend) {
		friends.add(newFriend);
	}
	
	public void removeFriend(UserAccount removeUser) {
		friends.remove(removeUser);
		
	}
	
	
	// View friend list.
	public void view() {
		friends.toString();
	}
	
	public void follow(UserAccount followUser) {
		following.add(followUser);
	}
	
	public static void main(String[] args) {
		

	}

}

}
