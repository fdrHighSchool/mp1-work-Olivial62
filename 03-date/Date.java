
/*
 * Write a description of class Date here.
 *
 * @Olivia Larmand
 * @9/28/22
 *
*/

import java.util.Scanner;


public class Date

{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the day: ");
        String day = s.nextLine();
        
        System.out.print("Enter the month: ");
        String month = s.nextLine();
        
        System.out.print("Enter today's Date: ");
        String date = s.nextLine();
        
        System.out.print("Enter the year: ");
        String year = s.nextLine();
        
        System.out.println(day+ ", " + month +" "+ date +", " + year);
        System.out.println(day +" "+ date +" "+ month +" "+ year);
        
        s.close();
        System.out.print("Enter today's Date: ");
        String dates = s.nextLine();
        System.out.println(dates);
        //System.out.println(Day);
    }//end of main method
     
}// end of class Date 
