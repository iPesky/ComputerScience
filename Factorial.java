// Thomas Huber 8/28/17

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number you would like the factorial of: ");
        long i, n, f = 1;
        n = scan.nextLong();
        boolean done = false;

        if (n >= 1 && n <= 16) {
            for (i = 1; i <= n; i++) {
                f = f * i; 
            }
            System.out.printf("\nThe factorial of %d is %d", n, f);
            done = true;
        } else {
            System.out.println("That number will cause an overflow, enter something less than or equal to 16");
        }
    }
}