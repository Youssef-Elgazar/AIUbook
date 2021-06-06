package main;

import java.io.*;
import java.util.*;

public class Profile implements Serializable {
	private String email;
	private String password;
	private String gender;
	public Friends friends = new Friends();
	private int age;
	private String userName;
	private String biography;
	private String education;
	private String work;
	private static String relationshipStatus;
	public ArrayList<Post> profilePosts;
	public ArrayList<Group> profileGroups;
	public ArrayList<Page> profilePages;
	
	
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
		switch (relationStatus) {
		
		case(("Married")):
		case(("married")):	
			 relationStatus.equals("Married");
			break;
			
		case(("Single")):
		case(("single")):
			 relationStatus.equals("Single");
			break;
		
		case(("Engaged")):
		case(("engaged")):
			 relationStatus.equals("Engaged");
			break;
		
		case((" Complicated")):
		case(("complicated")):	
			 relationStatus.equals("It's Complicated");
			 break;
		
		default: 
			System.out.println("Invalid Input, Please Try Again!");
	}}

	public void setProfilePosts(Post newPost) {
		this.profilePosts.add(newPost);
	}

	public void setNewPassword(String newPassword) {
		/* Enter old password before changing password. */
	}

	public static void setAbout(Profile currentProfile) {
		Scanner console = new Scanner(System.in);
		String choice;
		System.out.println("What do you want to change about you? (Bio | Education | Work | Relationship Status");
		choice = console.nextLine();

		switch (choice) {
		case "Bio":
		case "bio":
			String newBio;
			System.out.println("Enter your new biography...");
			newBio = console.nextLine();
			currentProfile.setBiography(newBio);
			break;
		case "Education":
		case "education":
			String newEdu;
			System.out.println("Enter your new education...");
			newEdu = console.nextLine();
			currentProfile.setEducation(newEdu);
			break;
		case "Work":
		case "work":
			String newWork;
			System.out.println("Enter your new work...");
			newWork = console.nextLine();
			currentProfile.setWork(newWork);
			break;
		case "Relationship status":
		case "relationship status":
			String newRS;
			System.out.println("Enter your new relationship status...");
			newRS = console.nextLine();
			currentProfile.setRelationshipStatus(newRS);
			System.out.println(relationshipStatus);
			break;
		default:
			System.out.println("Option does not exist, try again.");
			setAbout(currentProfile);
		}
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

	public void getAbout() {
		System.out.println("Username: " + getUserName());
		System.out.println("Age: " + getAge());
		System.out.println("Gender: " + getGender());
		System.out.println("Education: " + getEdu());
		System.out.println("Work: " + getWork());
		System.out.println("Relationship status: (Married | Engaged | Single | Complicated "    + getRS());
		System.out.println("Biography: " + getBio());
	}

	public String getProfilePosts() {
		return this.profilePosts.toString();
	}

	public static Profile getProfileByUserName() {
		Scanner console = new Scanner(System.in);
		String choice;
		Profile userProfile = null;
		System.out.print("Search by username: ");
		choice = console.nextLine();
		System.out.println("");

		for (int x = 0; x < User.allUsers.size(); x++) {
			if (User.allUsers.get(x).userName.equals(choice)) {
				userProfile = User.allUsers.get(x);
			}
		}

		return userProfile;
	}

}
