package main;
import java.util.*;

public class Profile {
	private String gender;
	private int age;
	private String userName;
	private String biography;
	private String education;
	private String work;
	private String relationshipStatus;
	private ArrayList<Post>profilePosts;
	
	public Profile(String gender, int age, String userName) {
		 this.gender = gender;
		 this.age = age;
		 this.userName = userName;
	}
	
	public void setBiography(String bio) {
		this.biography = bio;
	}
	
	public void setEducation(String edu) {
		this.education = edu;
	}
	
	public void setWork(String work) {
		this.work = work;
	}
	
	public void setRelationshipStatus(String relationStatus) {
		this.relationshipStatus = relationStatus;
	}
	
	public void setProfilePosts(Post newPost) {
		this.profilePosts.add(newPost);
	}
	
	/* =========================== */
	
	public String getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getBio() {
		return this.biography;
	}
	
	public String getEdu() {
		return this.education;
	}
	
	public String getWork() {
		return this.work;
	}
	
	public String getRS() {
		return this.relationshipStatus;
	}
	
	public String getUserName() {
		return this.userName;
	}
	

	
}
