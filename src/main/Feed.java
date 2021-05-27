package main;
import java.util.*;

public class Feed {
	public static void populateFeed() {
		// User.allUsers.Profile.getProfilePosts().forEach(post) -> System.out.println(post.postContent);
		for (int x = 0; x < User.allUsers.size(); x++) {
			for (int y = 0; y < User.allUsers.get(x).profilePosts.size(); y++) {
				System.out.println(User.allUsers.get(x).profilePosts.get(y));
				System.out.println("==============================================");
			}
	      }   	
	}
	
	public static void search() {
		Scanner console = new Scanner(System.in);
		String searchQuery;
		
		System.out.print("Enter search query: ");
		searchQuery = console.nextLine();
		System.out.println("");
		
		for (int x = 0; x < User.allUsers.size(); x++) {
			for (int y = 0; y < User.allUsers.get(x).profilePosts.size(); y++) {
				if(User.allUsers.get(x).profilePosts.get(y).getPostContent().contains(searchQuery)) {
					/* Add users to search results */
					System.out.println(User.allUsers.get(x).profilePosts.get(y));
					System.out.println("==============================================");
				}
			}
	      }   	
	}
}