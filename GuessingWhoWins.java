import java.util.Random;
import java.util.Scanner;


public class GuessingWhoWins {
	// Here the user will enter a number to guess//
	
    public static void main(String [] args) {
    	//function that initializes the guessing program
        Random team = new Random ();
        int pickANumber = team.nextInt (100);
      //variable of number from 1-100
        int Tries = 0;
      //variable for number of tries
        Scanner input = new Scanner(System.in);
    	//used to get user input

        int guess;
      //variable used as placeholder for user input
        boolean vin = false;
      //boolean variable to represent True answer
        
        while (vin == false){
        	//while loop for guessing game, runs while correct number is not shown
            System.out.println (" Guess a number between 1 and 1000: ");
            guess = input.nextInt ();
            Tries++;

            if (guess == pickANumber) {
                vin = true;
            }
            else if (guess <= pickANumber) {
            System.out.println("Your guess is low, guess again ");
            }
            else if (guess >= pickANumber) {
                System.out.println ("Your guess is high, guess again ");
            }
        }
        System.out.println ("You Guessed Right");
        System.out.println ("The Guess Was " + pickANumber);
        System.out.println ("It took you " + Tries + "tries");
    }
    




   
}