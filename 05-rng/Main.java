import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    System.out.println("What mode do you you want? \nEasy\nMedium\nHard");
    int userGuess;
    

    System.out.print("Enter your guess: ");
    int playerGuess = s.nextInt(); 

        // if the player guessed incorrectly
        if(playerGuess != number) {
            // if the player guessed too low
            if(playerGuess < number) {
                System.out.println("You were off by " + (number - playerGuess));
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - number));
            } // end inner else statement
        } // end outer if statement
        // if the player didn't guess incorrectly (meaning, correct guess)
        else {
            System.out.println("Correct!!!");
        } // end outer else statement
    } // end main method
} // end class
    
  