public class Circle {
   private static double radius;
   private static double diameter;
   private static double area;
   private static double PI = 3.14;
   
   public Circle() {
      radius = 1;
      diameter = radius * 2;
      area = PI * (radius * radius);
   }
   
   public void setRadius(double rad) {
      radius = rad;
      diameter = rad * 2;
      area = PI * (rad * rad);
   }
   
   public static double getRadius() {
      return radius;
   }
   
   public static double getDiameter() {
      return diameter;
   }
   
   public static double getArea() {
      return area;
   }
}