// Thomas Huber 8/9/17

/*
Create a program that asks the user for their password. The program checks their
 input against "Ovr9000". If the password is correct then output to the user
 "Welcome back." If it is unsuccessful then output "Password Incorrect. 
 Please enter your password again." Using a while loop keep asking the user if 
 they enter it incorrectly.
*/

import java.util.Scanner;

public class Password {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean found = false;
		
		while (found == false) {
			System.out.println("Enter password ");
			String input = scan.nextLine(); 
			if (input.equals("Ovr9000")) {
				found = true;
				System.out.println("Correct Password!");
			} else { System.out.println("Incorrect, Try Again.");
			}
		}
	}
}