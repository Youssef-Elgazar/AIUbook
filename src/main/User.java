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
					enterProfile(User.allUsers.get(x));
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
	
	public static void enterProfile(Profile currentSession) {
		Scanner console = new Scanner(System.in);
		
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
		choice = console.nextInt();
		System.out.println("");
		
		switch(choice) {
		case 1:
			
			break;
		case 2:
			Feed.populateFeed();
			break;
		case 3:
			
			break;
		case 4:
			
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
		
	}

}
