import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    int userGuess;
    Scanner in = new Scanner(System.in);
    System.out.print("Guess my number: ");
    userGuess = in.nextInt();
    System.out.println("Your guess was: " + userGuess);
    System.out.println(number);
    int offBy;
    offBy= number-userGuess; 
    System.out.println("you were off by: " + offBy);
      }
}