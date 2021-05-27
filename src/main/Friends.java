package main;

import java.util.ArrayList;

public class Friends {
	private ArrayList <Profile> friends = new ArrayList <Profile>();  
	private ArrayList <Profile> following = new ArrayList <Profile>();  
	
	public void addFriend(Profile newFriend) {
		friends.add(newFriend);
		System.out.println("You and " +newFriend.getUserName() + " are now friends!");
	}
	
	public void removeFriend(Profile removeUser) {
		friends.remove(removeUser);
		System.out.println(removeUser.getUserName()+" has been removed from your friends.");
		
	}
	
	 
	
		
		// View friend list.
		public void view() {
			friends.toString();
		}
		
		public void follow(Profile followUser) {
			following.add(followUser);
			System.out.println("You are now following " + followUser.getUserName() );
		}
		
		public void Unfollow(Profile UnfollowUser) {
			following.remove(UnfollowUser);
	
		}
		
		}

	
