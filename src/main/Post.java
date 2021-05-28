package main;
import java.util.*;

public class Post {
	private Profile postAuthor;
	private String postContent;
	private int numOfPostLikes;
	private ArrayList<String> postComments  = new ArrayList<String>();
	private int numOfPostComments = postComments.size();
	private static String privacy;
	
	Post(String postContent, String privacy, Profile postCreator){
		this.postContent = postContent;
		this.privacy = privacy;
		this.postAuthor = postCreator;
	}
	
	public static void makePost(String postContent, String Privacy, Profile postCreator) {
		Post newPost = new Post(postContent, privacy, postCreator);
		
		postCreator.setProfilePosts(newPost);
	}
	
	public void comment(String newComment, Profile commenter) {
		this.postComments.add(commenter.getUserName() + "\n" + newComment);
	}
	
	public void like() {
		// ISSUE: Same post can be liked by the same user multiple times.
		this.numOfPostLikes++;
	}
	
	public void share(Profile sharingProfile) {
		makePost(this.postContent, this.privacy, sharingProfile);
	}
	
	public String getPostContent() {
		return this.postContent;
	}
	
	public int getNumOfPostComments() {
		return this.numOfPostComments;
	}
	
	public int getNumOfPostLikes() {
		return this.numOfPostLikes;
	}

	
}
