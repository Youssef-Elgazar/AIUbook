package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Pages extends Groups{

	private ArrayList<String> recs  = new ArrayList<String>();	
	

	public void create() {

		System.out.println("Enter your page name");
		setName(name);
		System.out.println("What is your page about?");
		setAbout(about);
	
	}

	public static String getName() {
		return name;
	}
	public void addRecs() {
		Scanner console = new Scanner(System.in);
		System.out.println("What do you think about" + Pages.getName());  
		String newRec = console.next();
		recs.add(newRec);
		System.out.println(newRec);
	}
	}