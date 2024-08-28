/* 
   By: Arvin S. Albeos
   Started: Aug 28, 2024 - 9:31 PM
   Finished: Aug 28, 2024 - 11:01 PM
   
   The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
   We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in
*/

public class warmup_sleepin {

   public static boolean sleepIn(boolean weekday, boolean vacation) {
      if (weekday != true || vacation != false) 
         return true;
       else 
         return false;  
   }
   
   public static void main(String[] args) {
      System.out.println(sleepIn(false,false));
      System.out.println(sleepIn(true,false));
      System.out.println(sleepIn(false,true));
   }
}