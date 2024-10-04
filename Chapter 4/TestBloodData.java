import java.util.*;

public class TestBloodData {
   public static void main(String[] a) {
      Scanner sc = new Scanner(System.in);
      
      //Creating of instance to be able to invoke methods from the model class
      BloodData bldData = new BloodData();
      
      //Showcasing of default patient's data by invoking display method 
      System.out.println("Default Patient's Blood Type and RH Factor:");
      bldData.displayBloodInfo();
      
      //Asking user to input his bld type and rh factor
      System.out.println("\nEnter Patient's Blood Type:");
      String bldType = sc.nextLine();
      System.out.println("Enter Patient's RH Factor: ");
      String RH = sc.nextLine();
      
      bldData.setBloodType(bldType); //invoking of setter method to set the inputted blood type
      bldData.setRhFactor(RH); //invoking of setter method to set the inputted rh factor
      bldData.displayBloodInfo(); //invoking of the display method to display user input bld type and rh factor
      
      //Invoking the setter methods once again and giving another set of data
      //This time, data are given directly and not user input
      bldData.setBloodType("AB");
      bldData.setRhFactor("+");
      
      //Usage of both getter methods from the model class - "BloodData" - to display the bld type
      //and rh factor in the main method 
      System.out.println("\nYour blood type is: "+bldData.getBloodType()+"\nYour RH Factor is: "+bldData.getRhFactor());
   }
}