import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Class to hold mindfulness program
class MindfulnessProgram {
	//Variables to store user info
	private String name;
	private int age;
	private int yearsPracticing;
	
	// Constructor to set user info
	MindfulnessProgram(String name, int age, int yearsPracticing ) {
		this.name = name;
		this.age = age;
		this.yearsPracticing = yearsPracticing;
	}
	
	//Method to prompt user for necessary info 
	public void promptForInfo() throws IOException {
		System.out.println("Welcome to the Mindfulness Program!");
		
		//Prompt for name
		System.out.print("Please enter your name: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		this.name = br.readLine();
		
		//Prompt for age
		System.out.print("Please enter your age: ");
		while (!br.ready()) {
			this.age = Integer.parseInt(br.readLine());
		}
		
		//Prompt for years practicing
		System.out.print("Please enter your years practicing mindfulness: ");
		while (!br.ready()) {
			this.yearsPracticing = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Thank you for your information. Let's get started.");
	}
	
	//Method to generate introduction to program
	public void introduction() {
		System.out.println("Hello " + this.name + ", welcome to the mindfulness program. We will help you "
				+ "find inner peace and balance through meditation and self-reflection.");
	}
	
	//Method to generate program's plan
	public void plan() {
		//Print introduction
		System.out.println("\nWe have a tailored plan for you to start your journey.");
		
		//Print plan
		System.out.println("We suggest you start with 10 minutes of mindful breathing and stretching "
				+ "every day for the first two weeks. After two weeks, if you are comfortable, you can increase "
				+ "your practice to 20 minutes each day.");
		
		System.out.println("For the first month, we also suggest spending an additional 10 minutes each day "
				+ "journaling about your experience and reflecting upon your progress.");
		
		System.out.println("You can then move onto body scans and guided meditation if you wish. "
				+ "We recommend that you find a qualified instructor to guide you if you choose to take this path.");
		
		//Print advice
		System.out.println("Most important of all, listen to your body. Everyone's journey is different and you "
				+ "know yourself best. Take it at a pace that is comfortable for you. Do what feels right.");
	}
	
	//Method to generate final message
	public void concludingMessage() {
		System.out.println("\nWe hope this program will help you find inner peace and balance. Best of luck on your journey!");
	}
	
	//Method to run program
	public void runProgram() {
		try {
			promptForInfo();
			introduction();
			plan();
			concludingMessage();
		}
		catch (IOException e) {
			System.out.println("We apologize for the inconvenience. An error has occured. Please try again later.");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		MindfulnessProgram mp = new MindfulnessProgram("", 0, 0);
		mp.runProgram();
	}
}