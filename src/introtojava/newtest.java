package introtojava;

import java.util.Scanner;

public class newtest {
  public static void main(String[] args) {
    System.out.println("\n\nLet's play 20 questions. Choose an animal and I will try to guess it!");
    Scanner scan = new Scanner(System.in);
  
    System.out.println("Is it a mammal (y/n)?");
    String answer = scan.nextLine();
    if (answer.equals("y")) {
      System.out.println("Is it a pet (y/n)?");
      answer = scan.nextLine();
      if (answer.equals("y")) {
           System.out.println("I guess a dog! Click on run to play again.");
       }
    }      
    else { // not a mammal
    	/*
    	 * In the very last else clause, the program knows that it is not a mammal and it guesses a bird. 
    	 * Let’s add to that part. Instead of saying “I guess a bird! Click on run to play again.”, 
    	 * change it to ask a question that distinguishes between birds and reptiles (for example does it fly?). 
    	 * Then, get their response and use an if statement to guess “bird” or “turtle” (or another reptile). 
    	 * For example, here’s how we decided to choose between a dog or an elephant. 
    	 * We asked the question “Is it a pet?”, got the response, and then with an if statement on the y/n answer we determined dog or elephant. 
    	 * You would use similar code to distinguish between a bird and a turtle. Run your code and test both possibilities!


    	 */
    	 
        System.out.println("does it fly (y/n)?");
        answer = scan.nextLine();
        if(answer.equals("y")) {
        	System.out.println("I guess a bird! Click on run to play again.");
        }else if(answer.equals("n")){
        	System.out.println("I guess an elephant! Click on run to play again.");
        }
      }      
  
scan.close();
  }
}
