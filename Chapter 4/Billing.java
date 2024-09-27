/* 
   By: Arvin S. Albeos
   Started: 9:25 AM / 09-27-2024
   Finished: 9:35 AM / 09-27-2024
   
*/

//Each method should calculate the total bill including an 8% tax and print the result.

public class Billing {

   //Inside the main method, call each computeBill method with appropriate arguments
   public static void main(String[] a) {
        computeBill(23.2);
        computeBill(23.2, 2);
        computeBill(23.2, 2, 5);
   }
   
   //Method that takes a single double parameter for price.
   public static void computeBill(double price) {
      double WITH_TAX = 1.08;
      
      double fPrice = price * WITH_TAX;
      System.out.printf("The total price for the bill is: $%.3f", fPrice);
   }
   
   //One that takes a double for price and an int for quantity.
   public static void computeBill(double price, int quantity) {
      double WITH_TAX = 1.08;
      
      double fPrice = ((price * quantity) * WITH_TAX);
      System.out.printf("\nThe total price for the bill is: $%.3f", fPrice);
   }
   
   
   //One that takes a double for price, an int for quantity, and an int for a coupon discount.
   public static void computeBill(double price, int quantity, int couponDisc) {
      double WITH_TAX = 1.08; 
          
      double fPrice = (((price * quantity) - couponDisc) * WITH_TAX) ;
      System.out.printf("\nThe total price for the bill is: $%.3f", fPrice);
   }
}