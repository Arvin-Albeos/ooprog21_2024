public class BloodData {

   //initialization of the variables that will be used inside the class BloodData
   //the said variables are static thus they are unique to the BloodData class
   private static String bloodType;
   private static String rhFactor;
   
   //method that calls upon the default patient's bld type and rh factor
   public BloodData() {
      defaultPatient();
   }
   
   //method that sets blood type and rh factor in default values "A" ang "-"
   public void defaultPatient() {
      this.bloodType =  "A";
      this.rhFactor = "-";
   }
   
   //receives the bloodType input from the user when the method is called
   //and sets it inside the BloodData class
   public void setBloodType(String bloodType) {
      this.bloodType = bloodType;
   }
   
   //receives the rh factor input from the user when the method is called
   //and sets it inside the BloodData class
   public void setRhFactor(String rhFactor) {
      this.rhFactor = rhFactor;
   }
   
   //returns the Blood Type value received to the interface 
   //when the method is called 
   public String getBloodType() {
      return this.bloodType;
   }
   
   //returns the RH Factor value received to the interface 
   //when the method is called
   public String getRhFactor() {
      return this.rhFactor;
   }
   
   //when the method is called, it displays the blood type and rh factor in string formatted form
   public void displayBloodInfo() {
      System.out.println("Your blood type is: "+bloodType+"\nYour RH Factor is: "+rhFactor);
   }
}
