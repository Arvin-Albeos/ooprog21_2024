import java.util.*;

public class SpoonerismGenerator {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      SpoonerismGenerator spooner = new SpoonerismGenerator();
      int choice = 0;
      
      do {
      spooner.run();
      
      System.out.println("\nWould you like to input more? [1]Yes [2]No");
      choice = sc.nextInt();
      } while (choice != 2);
   }
   
   public static void run() {
       
         
         String wrd1 = getWord("Enter the first word: ");
         String wrd2 = getWord("Enter the second word: ");
         
         int vwlNdx1 = vowelIndex(wrd1, "\nFirst letter of first word: ");
         int vwlNdx2 = vowelIndex(wrd2, "\nFirst letter of second word: ");
         
         
         if (vwlNdx1 == 0 || vwlNdx2 == 0) {
            System.out.println("\n"+wrd1+" and "+wrd2+" are not good words to spoonerize.");
            return;
         } 
         if (vwlNdx1 == 1 || vwlNdx2 == 1) {
            String spoonerized1 = wrd2.substring(0, vwlNdx2) + wrd1.substring(vwlNdx1);
            String spoonerized2 = wrd1.substring(0, vwlNdx1) + wrd2.substring(vwlNdx2); 
            System.out.println("\nThe words "+wrd1+" and "+wrd2+" spoonerized are: "+spoonerized1+" and "+spoonerized2);
            return;
         }
   }
   
   public static String getWord(String text) {
      Scanner sc = new Scanner(System.in);
      System.out.println(text);
      String word = sc.nextLine();
      return word;
   }
   
   public static int vowelIndex(String word, String text) {
      char chr = word.charAt(0);
      
      System.out.println(text + chr);
      
      if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'||
          chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U' ) {
         return 0;
      } else {
         return 1;
      }
   }
}