package main;
import java.util.ArrayList;

public class Groups {

	protected static String name;
	private ArrayList<String> followers = new ArrayList<String>();
	protected String about;

	
	public void makeGroup() {
		
		System.out.println("Enter your group name");
		setName(name);
		System.out.println("What is your group about?");
		setAbout(about);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAbout(String About) {
		this.about = About;
	}
	

	
	public void follow(Profile newFollower, Groups group) {
		newFollower.profileGroups.add(group);				//made it work
 
	}	
}
