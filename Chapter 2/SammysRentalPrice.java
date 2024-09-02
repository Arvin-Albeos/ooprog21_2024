/* 
2. Sammy's Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs, and umbrellas to tourists.
Write a program that prompts the user for the number of minutes he rented a piece of sports equipment. 
Compute the rental cost as $40 per hour plus $1 per additional minute. (Lou might have surmised already that this 
rate has a logical flaw, but for now, calculate rates as described here.) Display Sammy's motto with the attachment below. 
Then display the hours, minutes, and total price. Save the file as SammysRentalPrice.java.

By: Arvin S. Albeos
Started: Sept 3, 2024 - 3:35 PM
Finished: Sept 3, 2024 - 3:55 PM

*/

import java.util.*;

public class SammysRentalPrice {
   
   public static void banner() {
   
      String first = new String("Sammy's makes it fun in the sun.");
      System.out.println();
      
      //Banner First Line
      for(int i=0; i < 40; i++){
         System.out.print("S");
      }
      System.out.println();
      
      //Banner Second Line
      for(int i=0; i < 3; i++){
         if (i == 0) {
            System.out.print("S");            
         }         
         System.out.print(" ");
      }      
      System.out.print(first + "   S");
      System.out.println();
            
      //Banner Second Line
      for(int i=0; i < 40; i++){
         System.out.print("S");
      }
      System.out.println("\n");
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      //Initialization of variables
      int mins;
      final int PRICE_PER_HOUR = 40;
      final int ADD_PRICE = 1;
      
      //Banner Call
      banner();
      
      //Prompting for the number of minutes
      System.out.print("Number of Minutes of Rental: ");
      mins = sc.nextInt();
      
      //Operations to be used for conversion to hour and calculating total cost
      int hour = mins / 60;
      int rem = mins % 60;
      int tCost = (hour * PRICE_PER_HOUR) + (rem*ADD_PRICE);
      
      banner();
      
      //Displaying of the number of hours, minutes and the total cost to be paid
      System.out.println("Hours of Rent: " + hour + 
                         "\nMinutes of Rent: " + rem + 
                         "\nTotal Cost: (" + hour + " * $" + PRICE_PER_HOUR + ") + (" + rem + " * $" + ADD_PRICE + ") = $" + tCost);
                         
      //Ending Message                        
      System.out.println("\n\nThank you for your patronage. Until next time!");                  
   }
}