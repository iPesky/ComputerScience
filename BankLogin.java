// Thomas Huber 8/11/17

import java.util.Scanner;

public class BankLogin {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean isCorrect = false;
		double pin = 12345; 
		double input;
		int tries = 1;
		int maxTries = 3;
		
		System.out.println("Welcome to the Bank of Thomas Huber Bank LLC. INC. Bank");
		
		
		while (isCorrect == false && tries <= maxTries) {
			System.out.println("Enter your pin: ");
			input = scan.nextDouble();
			if (input == pin) {
				System.out.println("Welcome to the Bank of Thomas Huber Bank LLC. INC. Bank");
				System.out.println(" ");
				tries++;
				isCorrect = true;
			} else {
				System.out.println("Incorrect, try again");
				System.out.println(" ");
				tries++;
			}
		} 
		
		if (isCorrect == false) {
			System.out.println("Max attempts; you failed, try again never :). This is our money now btw... ");
		} 
	}
	
}