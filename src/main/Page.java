package main;

import java.util.*;

public class Page extends Group {

	private ArrayList<String> recs = new ArrayList<String>();

	public void makePage() {
		Page newPage = new Page();
		System.out.println("Enter your page name");
		newPage.setName(name);
		System.out.println("What is your page about?");
		newPage.setAbout(about);

		User.allPages.add(newPage);
	}

	public static Page getPageByName() {
		Page desiredPage = null;
		Scanner console = new Scanner(System.in);
		String choice;
		System.out.print("Search by page name: ");
		choice = console.nextLine();
		System.out.println("");

		for (int x = 0; x < User.allPages.size(); x++) {
			if (User.allPages.get(x).name.equals(choice)) {
				desiredPage = User.allPages.get(x);
			}
		}

		return desiredPage;

	}

	static void follow(Profile newFollower, Page page) {
		newFollower.profilePages.add(page);
	}

	static void removePage(Profile follower, Page page) {
		follower.profilePages.remove(page);
	}

	public static String getName() {
		return name;
	}

	public void addRecs() {
		Scanner console = new Scanner(System.in);
		System.out.println("What do you think about " + Page.getName() + "?");
		String newRec = console.next();
		recs.add(newRec);
		System.out.println(newRec);
	}
}