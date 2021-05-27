package main;
import java.util.*;

public class Feed {
	public void populateFeed() {
		// User.allUsers.Profile.getProfilePosts().forEach(post) -> System.out.println(post.postContent);
		for (int x = 0; x < User.allUsers.size(); x++) {
			for (int y = 0; y < User.allUsers.get(x).profilePosts.size(); y++) {
				System.out.println(User.allUsers.get(x).profilePosts.get(y));
				System.out.println("==============================================");
			}
	      }   	
	}
}