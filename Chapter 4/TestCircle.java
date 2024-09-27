import java.util.*;

public class TestCircle {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Circle a = new Circle();
      Circle b = new Circle();
      Circle c = new Circle();
      a.setRadius(3);
      
      System.out.println("Radius of the first circle: "+a.getRadius() + 
                        "\nDiameter of the first circle: "+a.getDiameter() + 
                        "\nArea of the first circle: "+a.getArea());
   
      b.setRadius(20);
      
      System.out.println("\nRadius of the second circle: "+b.getRadius() + 
                        "\nDiameter of the second circle: "+b.getDiameter() + 
                        "\nArea of the second circle: "+b.getArea());
                        
      System.out.print("\nInput radius of the third circle: ");
      double rad = sc.nextDouble();
      c.setRadius(rad);
      
      System.out.println("\nRadius of the third circle: "+c.getRadius() + 
                        "\nDiameter of the third circle: "+c.getDiameter() + 
                        "\nArea of the third circle: "+c.getArea());
   }
}