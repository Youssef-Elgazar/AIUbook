package main;
import java.util.*;

public class Group {

	protected static String name;
	private ArrayList<String> followers = new ArrayList<String>();
	protected String about;

	
	public void makeGroup() {
		Group newGroup = new Group();
		System.out.println("Enter your group name");
		newGroup.setName(name);
		System.out.println("What is your group about?");
		newGroup.setAbout(about);
		
		User.allGroups.add(newGroup);
	}
	
	static void join(Profile newMember, Group group) {
		newMember.profileGroups.add(group);
	}
	
	static void removeGroup(Profile member, Group group) {
		member.profileGroups.remove(group);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAbout(String About) {
		this.about = About;
	}
	
	public static Group getGroupByName() {
		Group desiredGroup = null;
		Scanner console = new Scanner(System.in);
		String choice;
		System.out.print("Search by group name: ");
		choice = console.nextLine();
		System.out.println("");
		
		for (int x = 0; x < User.allGroups.size(); x++) {
			if (User.allGroups.get(x).name.equals(choice)) {
				desiredGroup = User.allGroups.get(x);
			}
	      }   	
		
		return desiredGroup;
		
	}
	
	public static void editPagesAndGroups(Profile currentProfile) {
		Scanner console = new Scanner(System.in);
		int choice;
		System.out.println("1. Add group.");
		System.out.println("2. Remove group.");
		System.out.println("3. Add page.");
		System.out.println("4. Remove page.");
		// System.out.println("5. Back to profile menu.");
		System.out.print("~> ");
		choice = console.nextInt();
		System.out.println("");
		
		switch(choice) {
		case 1:
			join(currentProfile, getGroupByName());
			System.out.println("Press any key to continue....");
			console.nextLine();
			editPagesAndGroups(currentProfile);
			break;
		case 2:
			removeGroup(currentProfile, getGroupByName());
			System.out.println("Press any key to continue....");
			console.nextLine();
			editPagesAndGroups(currentProfile);
			break;
		case 3:
			Page.follow(currentProfile, Page.getPageByName());
			System.out.println("Press any key to continue....");
			console.nextLine();
			editPagesAndGroups(currentProfile);
			break;
		case 4:
			Page.removePage(currentProfile, Page.getPageByName());
			System.out.println("Press any key to continue....");
			console.nextLine();
			editPagesAndGroups(currentProfile);
			break;
		case 5:
			// Back to previous menu.
			break;
		default:
			System.out.println("Invalid choice! Please try again.");
			editPagesAndGroups(currentProfile);
		}
		
	}
	
	
}
