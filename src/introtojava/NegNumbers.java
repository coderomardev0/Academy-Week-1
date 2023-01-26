package introtojava;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In your main method, declare an integer variable.
		int num1;
		
		//Create a Scanner object to take input from a user.
		Scanner newScan = new Scanner(System.in);
		
		//Print a prompt for the user to enter a number.
		System.out.print("Please enter a number");
		
		//Receive the number from the user using the appropriate scanner method.
		num1 = newScan.nextInt();
		
		//Create the conditions to check if the number is positive or negative
		//Print the output.
		if(num1 > 0) {
			System.out.println(num1 + " is a POSITIVE number!");
		}else if(num1 < 0){
			System.out.println(num1 + " is a NEGATIVE number!");
		}

	}

	scanner.close();
}


/* 
Your next task is to instruct your computer to display whether a number is positive or negative.

Steps:

Create a new class for this exercise just like you did for your Hello World example, but give it a new name. 
You can name the class/file NegNumbers.java for example.  

Import the scanner library.

In your main method, declare an integer variable.

Create a Scanner object to take input from a user.

Print a prompt for the user to enter a number.

Receive the number from the user using the appropriate scanner method.

Create the conditions to check if the number is positive or negative

Print the output.

Test your code.

If it works as expected, copy/paste your code into the file below. 
*/