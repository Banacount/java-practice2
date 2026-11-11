/*
 * I am just experimenting with the stuff that our instructor taught us lmao.
 * I know I already know this stuff but it's nice to get to know them again yk.
 * It gets the brain pathways pumping again.
 *
 * This practice is primarily inspired from module 04 (Control-Structure-Loops)
 * */

package org.example;
import java.util.Scanner;

public class Loops {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Check if an input is an integer
		while (true) 
		{
			System.out.print("Enter a proper integer: ");
			if (!input.hasNextLine()) {
				System.out.println("No input on this one buddy, ENABLE IT!");
				break;
			}
			String response = input.nextLine();

			try {
				int getNum = Integer.parseInt(response);
				System.out.printf("%d is an integer!\n", getNum);
				break;
			} catch (Exception e) {
				System.out.println("Invalid value!");
			}
		}

		// Running the do loop again if num2 is less than or equals to 0
		int num2 = 0;
		do {
			System.out.printf("%d is not greater than 0 u heard?\n", num2);

			try {
				System.out.print("So enter an integer greater than 0: ");
				num2 = Integer.parseInt(input.nextLine());
			} catch (Exception e) {
				System.out.println("Invalid value!");
			}
		} while (num2 <= 0);
		System.out.printf("%d is indeed greater than 0.\n", num2);

		// Iterate through the num2 with for loop
		for (int i = 0; i < num2; i++) {
			System.out.println("Thank you and yes king!");
		}

		input.close();
	}
}
