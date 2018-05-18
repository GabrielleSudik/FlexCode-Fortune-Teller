import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the fortune teller.");
		System.out.println("Please enter your first name.");
		Scanner input = new Scanner(System.in);
		String firstName = input.nextLine();
		System.out.println("Please enter your last name.");
		String lastName = input.nextLine();
		System.out.println("Please enter your age in round numbers.");
		int age = input.nextInt();
		System.out.println("Please enter your month of birth, in number format.");
		int month = input.nextInt();
		System.out.println("What is your favorite ROY G BIV color?");
		System.out.println("Type \"help\" if you don't know ROY G BIV.");
		String color = input.nextLine();
		//why didn't that allow for input??
		System.out.println("Finally, how many siblings do you have?");
		int siblings = input.nextInt();
		
		input.close();
		//still not sure why this is needed.
		
		System.out.println("Here is your fortune:");
		
		if(age % 2 == 0) {
			System.out.println("You will retire in 10 years.");
		}
		else {
			System.out.println("You will retire in 15 years.");
		}
		
		if (siblings <0) {
			System.out.println("Your retirement home will be in Tarsus.");
		}
		else if (siblings == 0) {
			System.out.println("You will retire someplace warm and balmy, with a guest room.");
		}
		else if (siblings >= 1 && siblings <=4) {
			System.out.println("You will retire to a local lake community, with several guest rooms.");
		}
		else {
			System.out.println("You are sick of your siblings, so you will retire to a secret location where they can't crash your pad.");
		}
	}

}
