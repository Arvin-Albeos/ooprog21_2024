/* 
1. Carly's Catering provides meals for parties and special events. Write a program that prompts the user for the number of guests 
attending an event and then computes the total price, which is $35 per person. Display the company motto as displayed in the attachment
below, and then display the number of guests, price per guest, and total price. Also, display a message that indicates true
or false depending on whether the job is classified as a large event-an event with 50 or more guests. Save the file as CarlysEventPrice.java.

   By: Arvin S. Albeos
   Started: Sept 3, 2024 - 2:54 PM
   Finsihed: Sept 3, 2024 - 
*/

import java.util.*;

public class CarlysEventPrice {

   public static void banner() {
   
      String first = new String("Carly's makes the food that makes");
      String second = new String("it a party");
      System.out.println();
      
      //Banner First Line
      for(int i=0; i < 40; i++){
         System.out.print("*");
      }
      System.out.println();
      
      //Banner Second Line
      for (int i = 0; i<3; i++) {
         if(i == 0) {
            System.out.print("*");
         }      
         System.out.print(" ");
      }
      System.out.print(first + "  *");
      System.out.println();
      
      //Banner Third Line
      for(int i=0; i<14; i++){
         if(i == 0) {
            System.out.print("*");
         }      
         System.out.print(" ");
      }
      System.out.print(second);
      for(int i=0; i<15; i++) {
         if(i == 14) {
            System.out.print("*");
         }      
         System.out.print(" ");      
      }
      System.out.println();
      
      //Banner Fourth Line
      for(int i=0; i < 40; i++){
         System.out.print("*");
      }
      System.out.println();   
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numGuest;
      final int PRICE = 35;
      
      //Banner Call
      banner();
      
      //Prompt for user input on the number of guests
      System.out.print("Number of attending guests: ");
      numGuest = sc.nextInt();
      banner();
      
      //Displays the number of guests, the price per guest, and the total cost to be paid
      System.out.println("\nNumber of Guests: " + numGuest +
                          "\nPrice Per Guest: P" + PRICE +
                          "\nTotal Cost: " + numGuest + "*" + PRICE + " = " + "P" + (numGuest*PRICE));
      
      //Displays if the event is large - 50 or more people, and states whether it is TRUE or FALSE 
      if(numGuest >= 50) {
         System.out.println("\nLarge Event: TRUE");
      } else {
         System.out.println("\nLarge Event: FALSE");
      }
      
      //End Message
      System.out.println("\nThank you for trusting Carly's! Until the next party!");
   }
}