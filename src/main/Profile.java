package main;
import java.util.*;

public class Profile {
	private String email;
	private String password;
	private String gender;
	private int age;
	private String userName;
	private String biography;
	private String education;
	private String work;
	private String relationshipStatus;
	public ArrayList<Post> profilePosts;
	
	public Profile(String email, String password, String gender, int age, String userName) {
		 this.gender = gender;
		 this.age = age;
		 this.userName = userName;
		 this.email = email;
		 this.password = password;
	}
	
	public static void makeProfile(String email, String password, String gender, int age, String userName) {
		Profile newProfile = new Profile(email, password, gender, age, userName);
		
		User.allUsers.add(newProfile);
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
	
	public void setNewPassword(String newPassword) {
		/* Enter old password before changing password. */
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
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public ArrayList<Post> getProfilePosts() {
		return this.profilePosts;
	}
	

	
}
