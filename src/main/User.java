package main;
import java.util.*;

public class User {
	public static ArrayList<Profile> allUsers = new ArrayList<Profile>();
	public static ArrayList<Group> allGroups = new ArrayList<Group>();
	public static ArrayList<Page> allPages = new ArrayList<Page>();

	public static void main(String[] args) {
		startup();
	}

	public static void startup() {
		Scanner console = new Scanner(System.in);
		System.out.println("1. Login.");
		System.out.println("2. Signup.");
		System.out.println("3. Exit.");
		System.out.print("~> ");
		int choice = console.nextInt();
		System.out.println("");
		switch (choice) {
		case 1:
			login();
			break;
		case 2:
			signup();
			break;
		case 3:
			System.exit(0);
		default:
			System.out.println("Invalid choice! Please try again.");
			choice = console.nextInt();
			while (choice != 1 || choice != 2) {
				choice = console.nextInt();
			}
		}
	}

	public static void login() {
		Scanner console = new Scanner(System.in);
		String email, password;
		System.out.println("Enter email address:");
		email = console.nextLine();
		System.out.println("Enter password:");
		password = console.nextLine();

		for (int x = 0; x < User.allUsers.size(); x++) {
			if (email.equals(User.allUsers.get(x).getEmail()) && password.equals(User.allUsers.get(x).getPassword())) {
				System.out.println("Login successful!");
				Profile currentProfile = User.allUsers.get(x);
				showMainMenu(currentProfile);

			} else {
				/* Handle Login failure. */
				// System.out.println("Invalid email or password. Please try again.");
			}
		}
	}

	public static void signup() {
		Scanner console = new Scanner(System.in);
		String newEmail, newPassword, userName, gender;
		int age;

		System.out.println("Enter email address:");
		newEmail = console.nextLine();
		System.out.println("Enter password:");
		newPassword = console.nextLine();
		System.out.println("Enter username:");
		userName = console.nextLine();
		System.out.println("Enter gender:");
		gender = console.nextLine();
		System.out.println("Enter age:");
		age = console.nextInt();

		try {
			Profile.makeProfile(newEmail, newPassword, gender, age, userName);
		} catch (Exception e) {
			System.out.println("Something went wrong! Try again.");
		}
		System.out.println("Signup successful! Please login to your new account.");
		startup();

	}

	public static void signout() {
		startup();
	}

	public static void currentSession(Profile currentSession) {
		Scanner console = new Scanner(System.in);
		int choice;
		showProfileMenu();
		choice = console.nextInt();

		switch (choice) {
		case 1:
			currentSession.getAbout();
			System.out.println("Press any key to continue....");
			console.nextLine();
			showProfileMenu();
			break;
		case 2:
			String postContent, postPrivacy;
			System.out.println("What's on your mind?");
			postContent = console.nextLine();
			System.out.println("Who do you want to show this to? (Public | Friends)");
			postPrivacy = console.nextLine();
			Post.makePost(postContent, postPrivacy, currentSession);
			System.out.println("Press any key to continue....");
			console.nextLine();
			showProfileMenu();
			break;
		case 3:
			currentSession.getProfilePosts();
			System.out.println("Press any key to continue....");
			console.nextLine();
			showProfileMenu();
			break;
		case 4:
			currentSession.friends.view();
			System.out.println("Press any key to continue....");
			console.nextLine();
			showProfileMenu();
			break;
		case 5:
			// Show groups.
			currentSession.profileGroups.toString();
			System.out.println("Press any key to continue....");
			console.nextLine();
			showProfileMenu();
			break;
		case 6:
			// Show pages.
			currentSession.profilePages.toString();
			System.out.println("Press any key to continue....");
			console.nextLine();
			showProfileMenu();
			break;
		case 7:
			Profile.setAbout(currentSession);
			System.out.println("Press any key to continue....");
			console.nextLine();
			showProfileMenu();
			break;
		case 8:
			// Edit F and F.
			currentSession.friends.editFriendsAndFollowers(currentSession);
			System.out.println("Press any key to continue....");
			console.nextLine();
			showProfileMenu();
			break;
		case 9:
			// Edit G and P.
			Group.editPagesAndGroups(currentSession);
			System.out.println("Press any key to continue....");
			console.nextLine();
			showProfileMenu();
			break;
		case 0:
			// Back to previous menu.
			showMainMenu(currentSession);
			break;
		default:
			System.out.println("Invalid choice! Try again.");
			currentSession(currentSession);
			System.out.println("Press any key to continue....");
			console.nextLine();
			showProfileMenu();
			break;
		}

	}

	public static void showMainMenu(Profile currentProfile) {
		Scanner console = new Scanner(System.in);
		int choice;
		System.out.println("1. Search.");
		System.out.println("2. Show feed.");
		System.out.println("3. Show Profile");
		System.out.println("4. Chat.");
		System.out.println("5. Sign out.");
		System.out.print("Choose option: ");
		System.out.print("~> ");
		choice = console.nextInt();
		switch (choice) {
		case 1:
			Feed.search();
			System.out.println("Press any key to continue....");
			console.nextLine();
			showMainMenu(currentProfile);
			break;
		case 2:
			Feed.populateFeed();
			System.out.println("Press any key to continue....");
			console.nextLine();
			showMainMenu(currentProfile);
			break;
		case 3:
			currentSession(currentProfile);
			System.out.println("Press any key to continue....");
			console.nextLine();
			showMainMenu(currentProfile);
			break;
		case 4:
			// Chat.
			Chat.chooseReceiver(currentProfile);
			break;
		case 5:
			signout();
			startup();
			break;
		default:
			System.out.println("Invalid choice! Please try again.");
			showMainMenu(currentProfile);
			
		}
	}

	public static void showProfileMenu() {
		System.out.println("1. Show About.");
		System.out.println("2. Make new post.");
		System.out.println("3. Show your posts.");
		System.out.println("4. Show friends.");
		System.out.println("5. Show groups.");
		System.out.println("6. Show pages.");
		System.out.println("-----------------------");
		System.out.println("7. Edit about."); // ******************************
		System.out.println("8. Edit friends and followers.");
		System.out.println("9. Edit pages and groups.");
		System.out.println("0. Back to main menu.");
		System.out.print("Choose option: ");
		System.out.print("~> ");
	}

}
