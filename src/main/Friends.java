package main;

import java.util.*;

public class Friends {
		private static ArrayList <Profile> friends = new ArrayList <Profile>();  
		private static ArrayList <Profile> following = new ArrayList <Profile>();  
		
		public static void addFriend(Profile newFriend) {
			friends.add(newFriend);
			System.out.println("You and " + newFriend.getUserName() + " are now friends!");
		}
		
		public static void removeFriend(Profile removeUser) {
			friends.remove(removeUser);
			System.out.println(removeUser.getUserName()+" has been removed from your friends.");
			
		}
	
	 
	
		
		// View friend list.
		public void view() {
			friends.toString();
		}
		
		public static void follow(Profile followUser) {
			following.add(followUser);
			System.out.println("You are now following " + followUser.getUserName() );
		}
		
		public static void unfollow(Profile UnfollowUser) {
			following.remove(UnfollowUser);
	
		}
		
		public static void editFriendsAndFollowers(Profile currentProfile) {
			Scanner console = new Scanner(System.in);
			int choice;
			System.out.println("1. Add friend.");
			System.out.println("2. Remove friend.");
			System.out.println("3. Add follower.");
			System.out.println("4. Remove follower.");
			System.out.print("~> ");
			choice = console.nextInt();
			System.out.println("");
			switch(choice) {
			case 1:
				addFriend(Profile.getProfileByUserName());
				break;
			case 2:
				removeFriend(Profile.getProfileByUserName());
				break;
			case 3:
				follow(Profile.getProfileByUserName());
				break;
			case 4:
				unfollow(Profile.getProfileByUserName());
				break;
			default:
				System.out.println("Invalid choice! Please try again.");
				editFriendsAndFollowers(currentProfile);
			}
		}
		
		}

	
