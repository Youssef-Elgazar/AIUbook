package main;
import java.util.*;

public class Post {
	private Profile postAuthor;
	private String postContent;
	private int numOfPostLikes;
	private int numOfComments;
	private ArrayList<String> postComments  = new ArrayList<String>();
	private String privacy;
	
	Post(String postContent, String privacy, Profile postCreator){
		this.postContent = postContent;
		this.privacy = privacy;
		this.postAuthor = postCreator;
	}
	
	public void makePost(String postContent, String Privacy, Profile postCreator) {
		Post newPost = new Post(postContent, privacy, postCreator);
		
		postCreator.setProfilePosts(newPost);
	}
	
	public void comment(String newComment, Profile commenter) {
		this.postComments.add(commenter.getUserName() + "\n" + newComment);
		this.numOfComments++;
	}
	
	public void like() {
		this.numOfPostLikes++;
		
		// ISSUE: Same post can be liked by the same user multiple times.
	}
	
	public void share(Profile sharingProfile) {
		makePost(this.postContent, this.privacy, sharingProfile);
	}

	
}
