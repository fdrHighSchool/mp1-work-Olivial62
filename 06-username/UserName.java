import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    
    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.println("Are you a student or teacher? ");
    String status = s.nextLine();
    System.out.println("What is your favorite number? ");
    String num = s.nextLine();
    // test output
    // System.out.println("Hello " + initialize(firstName) + "." + initialize(lastName) + ".");
    if (status.equals("student")) {
       System.out.println(firstName + initialize(lastName) + num + "@nycstudents.net");
    }
    
    else {
       System.out.println(initialize(firstName) + lastName + num + "@schools.nyc.gov");
    }
    s.close();
    
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
   // end initialize method
   
  public static String initialize(String n) {
    return n.substring(0,1);
  }
} // end class
