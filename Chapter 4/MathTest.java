/* 
   By: Arvin S. Albeos
   Started: 3:00 PM / 10-02-2024
   Finishd: 3:26 PM / 10-02-2024
  
*/

import java.util.*;

public class MathTest {
   public static void main(String[] a) {
      Scanner sc = new Scanner(System.in); //Scanner initialization
      
      //Input of first number to show output regarding its square root, sin & cos value,
      //floor and ceiling value, and its value when round off...
      System.out.print("Enter number to output various math operations: ");
      double inputFirst = sc.nextDouble();
      
      //Output of the the first number regarding different Math Methods
      System.out.println("SQUARE ROOT of "+inputFirst+" = "+Math.sqrt(inputFirst));
      System.out.println("SIN of "+inputFirst+" = "+Math.sin(inputFirst));
      System.out.println("COS of "+inputFirst+" = "+Math.cos(inputFirst));
      System.out.println("FLOOR value of "+inputFirst+" = "+Math.floor(inputFirst));
      System.out.println("CEIL value of "+inputFirst+" = "+Math.ceil(inputFirst));
      System.out.println("ROUND value of "+inputFirst+" = "+Math.round(inputFirst));
      
      //Input of another number to compare with the first number...
      System.out.print("\nInput another value to compare with the first number: ");
      double inputSecond = sc.nextDouble();
      
      //Output of MAX value (larger num between the two) and MIN value (smaller num between the two)
      System.out.println("MAX value between "+inputFirst+" and "+inputSecond+" = "+Math.max(inputFirst, inputSecond));
      System.out.println("MIN value between "+inputFirst+" and "+inputSecond+" = "+Math.min(inputFirst, inputSecond));
      
      //Output of a randomized number
      System.out.printf("\nRandomized Number from 1 to 100 (set to 2 decimals) = %.2f",Math.random()*((100-1)+1));
   }
}