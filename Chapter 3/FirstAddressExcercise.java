public class FirstAddressExcercise {

   public static void main(String[] a) {

      System.out.println("First Java Application");
      
      //calling the static method which displays the address of the chosen phone brand
      displayAddress(); 

      //Additional Creations
      //creating an instance of the class to be able to call a non-static method
      //FirstAddressExcercise firstAddressExercise = new FirstAddressExcercise();
      
      //calling the non-static method with the use of the class instance
      //firstAddressExercise.displayBranch();
   }
   
   //a static method that contains the details of the address
   public static void displayAddress() {
      System.out.println("\nChosen Phone Brand: Infinix");
      System.out.println("Infinix Mobile");
      System.out.println("17th Floor, Desay Building No 9789 Shennan Road");
      System.out.println("High-Tech Park, Nanshan District");
      System.out.println("Shenzen, Guangdong, China");
      System.out.println("Company: Infinix Mobile Company");
   } 
   
   //Additional method (non-static type) that contains the PH branch of Infinix along with other details
//    public void displayBranch() {
//       System.out.println("\nPhilippine Branch Address:");
//       System.out.println("Infinix Kiosk");
//       System.out.println("Juan Luna Ave.");
//       System.out.println("3/F Cyberzone, SM City, Cebu");
//       System.out.println("Contact Details: 09222241177");
//    }
}
