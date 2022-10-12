import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("What mode do you you want? \nEasy\nMedium\nHard");
    String mode = s.nextLine();
    
    int number;
    int maximum;
    if (mode.equals("Easy")) {
        maximum = 10;
    }
    else if (mode.equals("Medium")) {
        maximum = 50;
    }
    else {
        maximum = 100;
    }
    
    number = (int)(Math.random() * maximum + 1);
    int userGuess;
    System.out.print("Enter your guess: ");
    int playerGuess = s.nextInt(); 
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
    
  