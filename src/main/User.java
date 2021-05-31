package main;
import java.util.*;

public class User {
	public static ArrayList<Profile> allUsers = new ArrayList<Profile>();
	
	
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
		switch(choice) {
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
			while(choice != 1 || choice != 2) {
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
				if(email.equals(User.allUsers.get(x).getEmail()) && password.equals(User.allUsers.get(x).getPassword())) {
					System.out.println("Login successful!");
					showMainMenu();
					int choice = console.nextInt();					
					switch(choice) {
					case 1:
						Feed.search();
						break;
					case 2:
						Feed.populateFeed();
						break;
					case 3:
						currentSession(User.allUsers.get(x));
						break;
					case 4:
						// Chat.
						break;
					case 5:
						signout();
						break;
					default:
						System.out.println("Invalid choice! Please try again.");
						choice = console.nextInt();
						while(choice < 1 || choice > 5) {
							choice = console.nextInt();
						}
					}
				} else {
					/* Handle Login failure. */
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
		login();
		
	}
	
	public static void signout() {
		startup();
	}
	
	public static void currentSession(Profile currentSession) {
		Scanner console = new Scanner(System.in);
		int choice;
		showProfileMenu();
		choice = console.nextInt();
		
		switch(choice) {
		case 1:
			currentSession.getAbout();
			break;
		case 2:
			String postContent, postPrivacy;
			System.out.println("What's on your mind?");
			postContent = console.nextLine();
			System.out.println("Who do you want to show this to? (Public | Friends)");
			postPrivacy = console.nextLine();
			Post.makePost(postContent, postPrivacy, currentSession);
			break;
		case 3:
			currentSession.getProfilePosts();
			break;
		case 4:
			currentSession.friends.view();
			break;
		case 5:
			// Show groups.
			break;
		case 6:
			// Show pages.
			break;
		case 7:
			Profile.setAbout(currentSession);
			break;
		case 8:
			// Edit F and F.
			break;
		case 9:
			//Edit G and P.
			break;
		default:
			
			break;
		}
		
	}
	
	public static void showMainMenu() {
		Scanner console = new Scanner(System.in);
		int choice;
		System.out.println("1. Search.");
		System.out.println("2. Show feed.");
		System.out.println("3. Show Profile");
		System.out.println("4. Chat.");
		System.out.println("5. Sign out.");
		System.out.print("Choose option: ");
		System.out.print("~> ");	
	}
	
	public static void showProfileMenu() {
		System.out.println("1. Show About.");
		System.out.println("2. Make new post.");
		System.out.println("3. Show your posts.");
		System.out.println("4. Show friends.");
		System.out.println("5. Show groups.");
		System.out.println("6. Show pages.");
		System.out.println("-----------------------");
		System.out.println("7. Edit about."); //******************************
		System.out.println("8. Edit friends and followers.");
		System.out.println("9. Edit pages and groups.");
		System.out.print("Choose option: ");
		System.out.print("~> ");
	}

}
