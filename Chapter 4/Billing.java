/* 
   By: Arvin S. Albeos
   Started: 9:25 AM / 09-27-2024
   Finished: 9:35 AM / 09-27-2024
   
*/

//Each method should calculate the total bill including an 8% tax and print the result.
import java.util.*;

public class Billing {
   //declaration of a global variable that will be used by multiple methods
   private static double WITH_TAX = 1.08;
   
   //Inside the main method, call each computeBill method with appropriate arguments
   public static void main(String[] a) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Input Item Price: ");
      double price = sc.nextDouble();
      System.out.println("Input Item Quantity: ");
      int quan = sc.nextInt();
      System.out.println("Input Coupon Discount: ");
      int coupDisc = sc.nextInt();
      
        computeBill(price);
        computeBill(price, quan);
        computeBill(price, quan, coupDisc);
   }
   
   //Method that takes a single double parameter for price.
   public static void computeBill(double price) {
      
      double fPrice = price * WITH_TAX;
      System.out.printf("The total bill of the item with tax is: $%.3f", fPrice);
   }
   
   //One that takes a double for price and an int for quantity.
   public static void computeBill(double price, int quantity) {
      
      double fPrice = ((price * quantity) * WITH_TAX);
      System.out.printf("\nThe total bill of %d items with tax is: $%.3f", quantity,fPrice);
   }
   
   
   //One that takes a double for price, an int for quantity, and an int for a coupon discount.
   public static void computeBill(double price, int quantity, int couponDisc) {
          
          //if we make the coupon discount in percent-based use with the code below
            double disc = couponDisc/100.00;
            double totalDisc = (price * quantity) * disc;
            //Note: use totalDisc instead of couponDisc in the process below
            //Note: if you want to use the integer only coupon discount then only use couponDisc in the process below
            
      double fPrice = (((price * quantity) - totalDisc) * WITH_TAX);
      System.out.printf("\nThe total bill of %d items with the tax, minus the %d%% coupon discount is: $%.3f", quantity, couponDisc,fPrice);
   }
}
