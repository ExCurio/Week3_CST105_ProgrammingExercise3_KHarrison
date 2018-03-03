/** Program: Guessing Game
 * File: GuessingGame.java
 * Summary: This program generates a random number between 1 - 10,000 and then allows the user to guess the number, providing dynamic
 *          feedback to the user in terms of "higher" or "lower" and the new range. Should the user guess the value the appropriate 
 *          message is displayed along with how many guesses it took.
 * 
 *
 * Author: Keith Harrison
 * Date: 3/3/2018
 * 
 */

// Import Scanner.
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        
        // Generate a random number between 1 - 10,000 (inclusive).
        int randomNumber = (int)(Math.random() * 10000)+1;        
         
        // Create a Scanner object.
        Scanner sc = new Scanner(System.in);
        
        // Initialize the variables.
        int guess = 0;
        int numberOfGuesses = 0;
        int min = 1;
        int max = 10000;
        
        // Loop continues while guess is not equal to the random number.
        while (guess != randomNumber) {
 
            // Prompt the user to enter their guess.
            System.out.print("\nEnter a guess between " + min + " and " + max + ": ");
            // Read the user's guess.
            guess = sc.nextInt();
            
            // Increment the number of guesses every time the loop runs.
            numberOfGuesses++;
       
            // If the guess is lower than the random number, display message to console.
            if (guess < randomNumber) {
                System.out.println("HIGHER");
                min = guess + 1;
            }
            
            // If the guess is greater than the random number, display message to console.
            else if (guess > randomNumber) {
                System.out.println("LOWER");
                max = guess - 1;
            }
            
            // Else the user correctly guesses the random number, congratulate the user and report the number of guesses.
            else
                System.out.println("\nYou win. It took you " + numberOfGuesses + " guesses."); 

            } // End of loop.

        // Close the scanner.
        sc.close();        
        
    }
    
}
