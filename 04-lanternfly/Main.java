import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("It is important to read to broaden your vocabulary, ");
        System.out.println("even when your not in school try to read over the summer.");
        
        System.out.print("Did you read over the summer? yes or no: ");
        String num = input.nextLine();
        
        if (num.equals("yes")) {
            System.out.println("How much books did you read over the summer? ");
            int num2 = input.nextInt();
            if (num2 <1) {
               System.out.println("So you read nothing, Do better!");
            }
            else if (num2 <= 2) {
               System.out.println("Not bad you can do better!");
            }// end num 2 if statement
            else if (num2 <= 5) {
              System.out.println("Wow thats really good");
            }
            else {
              System.out.println("That is amazing, your doing better than me.");
            }
             
        } 
        else {
            System.out.println("Go read some books");
        } // end else statement
        
    } // end main method

} // end class

