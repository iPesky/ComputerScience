// Thomas Huber 8/22/17

import java.util.Scanner;

public class ForLoopAddition {
	
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean belowTen = false;
        int input = 1;
        int total = 0;

        while (belowTen == false) {
            System.out.println("Enter a positive number under 10: ");            
            input = scan.nextInt();
            if (input < 10) {
                belowTen = true;
            } else {
                System.out.println("I\'m sorry that number is too big, please try again: ");
            }
        }

        for (int i = 1; i <= input; i++) {
            System.out.print(i);
            System.out.print(" ");
                if (i != input) {
                    System.out.print("+");
                    System.out.print(" ");
                }
            total += i;
        }
        System.out.println("= " + total);
	System.out.println("jacob is a dirty code copier");
    }
}
