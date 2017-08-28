// Thomas Huber 8/25/17

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How big? ");
        int n = scan.nextInt();
        System.out.println("\n");

        for (int c = 1; c <= n; c++) {
            for (int r = 1; r <= n; r++) {
                System.out.print(c * r + " ");
                if ((c * r) < 10) {
                    System.out.print("   ");
                } else if ((c * r) > 10 && (c * r)  < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }

    }
}