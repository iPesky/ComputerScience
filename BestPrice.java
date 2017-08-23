// Thomas 8/14/17

import java.util.Scanner;

public class BestPrice {   
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of your first item: ");
        String n1 = scan.nextLine();
        System.out.println("How many ounces is it? ");
        double o1 = scan.nextDouble();
        System.out.println("How much does it cost? ");
        double c1 = scan.nextDouble();
        double v1 = c1 / o1;

        System.out.println("Enter the name of your second item: ");
        String n2 = scan.next();
        System.out.println("How many ounces is it? ");
        double o2 = scan.nextDouble();
        System.out.println("How much does it cost? ");
        double c2 = scan.nextDouble();
        double v2 = c2 / o2;

        System.out.println("Enter the name of your third item: ");
        String n3 = scan.next();
        System.out.println("How many ounces is it? ");
        double o3 = scan.nextDouble();
        System.out.println("How much does it cost? ");
        double c3 = scan.nextDouble();
        double v3 = c3 / o3;

        System.out.println("Enter the name of your fourth item: ");
        String n4 = scan.next();
        System.out.println("How many ounces is it? ");
        double o4 = scan.nextDouble();
        System.out.println("How much does it cost? ");
        double c4 = scan.nextDouble();
        double v4 = c4 / o4;

        System.out.println("Enter the name of your fith item: ");
        String n5 = scan.next();
        System.out.println("How many ounces is it? ");
        double o5 = scan.nextDouble();
        System.out.println("How much does it cost? ");
        double c5 = scan.nextDouble();
        double v5 = c5 / o5;

        if (v1 < v2 && v1 < v3 && v1 < v4 && v1 < v5) {
            System.out.println(n1);
        } else if (v2 < v1 && v2 < v3 && v2 < v4 && v2 < v5) {
            System.out.println(n2);
        } else if (v3 < v1 && v3 < v2 && v3 < v4 && v3 < v5) {
            System.out.println(n3);
        } else if (v4 < v1 && v4 < v2 && v4 < v3 && v4 < v5) {
            System.out.println(n4);
        } else {
            System.out.println(n5);
        }
    }
}


