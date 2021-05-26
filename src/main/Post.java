package main;
import java.util.*;

public class Post {
	private User postAuthor;
	private String postContent;
	private int numOfPostLikes;
	private int numOfComments;
	private ArrayList<String> postComments  = new ArrayList<String>();
	private String privacy;
	
	Post(String postContent, String Privacy, User postCreator){
		this.postContent = postContent;
		this.privacy = privacy;
		this.postAuthor = postCreator;
	}
	
	public void comment(String newComment, Profile commenter) {
		this.postComments.add(commenter.getUserName() + "\n" + newComment);
		this.numOfComments++;
	}
	
	public void like() {
		this.numOfPostLikes++;
		
		// ISSUE: Same post can be liked by the same user multiple times.
	}
	
	public void share() {
		// ISSUE: Can't keep track of original poster and the sharer.
		// ISSUE#2: Can't make new post because can't call a constructor in a method.
	}

	
}
