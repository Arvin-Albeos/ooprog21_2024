import java.util.*;

public class PalindromeStringChecker {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a string: ");
      String input = sc.nextLine();
      
      String palindrome = new StringBuilder(input).reverse().toString();
      if(input.equalsIgnoreCase(palindrome)) {
         System.out.println("The word "+input+" is a palindrome.");
      } else {
         System.out.println("The word "+input+" is NOT a palindrome.");
      }
   }
}