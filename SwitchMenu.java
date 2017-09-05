// Thomas Huber 9/5/17

import java.util.Scanner;

public class SwitchMenu {
    public static void main(String []args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("This is the menu! Enter an option to see the selection:\n Abscenece Line Phone Number - p\nToday's Weather - w\nToday's Schedule - s\nThe next holiday - h\nExit (don't choose this one pls) - x");
        String option = sc.nextLine(); 
        boolean run = true;

        while (run) {
            switch (option) {
                case "p":
                System.out.println("The abscence line phone number is (480) 812-7703");
                break;
                case "w":
                System.out.println("The weather today in Arizona is 100°+ fahrenheit");
                break;
                case "s":
                System.out.println("Your schedule today is: \n 5:30am - eat breafast \n 6:30am - go to school \n 2:15 - go home \n 10:00 - sleep");
                break;
                case "h":
                System.out.println("The next Christmas is going to be on 12/25");
                break;
                case "x":
                System.out.println("Oh wow, bye then (╥_╥)");
                run = false;
                break;
            }
        }
    }
}