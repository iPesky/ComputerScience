// Thomas Huber 8/8/17

/*
Create a program that asks the user to type in a workers hourly wage, number
of regular hours, and number of overtime hours. Calculate the pay for the week
using 1.5 times the wage for the overtime wage (time and a half). Output to the
user how much money the person earned.
*/

import java.util.Scanner;
 
public class PayCalculator {
    
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
    	double wage;
    	double hours;
    	double ovhours;
    	double pay;

		System.out.println(&quot;Enter your income per hour: &quot;);
		wage = scan.nextDouble();
		System.out.println(&quot;Enter your number of hours: &quot;);
		hours = scan.nextDouble();
		System.out.println(&quot;Enter your number of overtime hours: &quot;);
		ovhours = scan.nextDouble();
		
		pay = (wage * hours) + (wage * ovhours);
		System.out.println(pay);
	}
}
