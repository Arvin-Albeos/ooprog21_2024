import java.util.*;

public class PalindromeStringChecker {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a string: ");
      String input = sc.nextLine();
      
      String palindrome = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      
      boolean bool1 = palindrome.equals(new StringBuilder(palindrome).reverse().toString());
      
      if(bool1 == true) {
         System.out.println("The word "+input+" is a palindrome.");
      } else {
         System.out.println("The word "+input+" is NOT a palindrome.");
      }
   }
}