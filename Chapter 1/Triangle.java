/** 
   By: Arvin S. Albeos
   Started: Aug 14, 2024 - 
   Finished: Aug 14, 2024 - 
   
   Displays a triangle pattern using the character '|' using the 'for loop' method.
*/

public class Triangle{
   public static void main (String[] args) {
      for(int i = 1; i <= 7; ++i) {
         for(int j = 1; j <= 7 - i; ++j) {
            System.out.print("  ");
         }
         for(int k = 0; k != 2 * i - 1; ++k) {
            System.out.print("| ");
         }
         System.out.println();
      }
   }
}