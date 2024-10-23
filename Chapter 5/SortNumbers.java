import java.util.*;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        System.out.print("Input 1st number: ");
        n1 = sc.nextInt();
        System.out.print("Input 2nd number: ");
        n2 = sc.nextInt();
        System.out.print("Input 3rd number: ");
        n3 = sc.nextInt();

        sc.close();

        // this applies for using CONDITIONAL LOGIC using if, else if, and else statements...

        // logic for descending order of the inputted numbers
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println("Descending order: " +n1+" "+n2+" "+n3);
            } else {
                System.out.println("Descending order: " +n1+" "+n3+" "+n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println("Descending order: " +n2+" "+n1+" "+n3);
            } else {
                System.out.println("Descending order: " +n2+" "+n3+" "+n1);
            }
        } else if (n3 > n1 && n3 > n2) {
            if (n2 > n1) {
                System.out.println("Descending order: " +n3+" "+n2+" "+n1);
            } else {
                System.out.println("Descendingorder: " +n3+" "+n1+" "+n2);
            }
        }

        // logic for ascending order of the inputted numbers
        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println("Ascending order: " +n1+" "+n2+" "+n3);
            } else {
                System.out.println("Ascending order: " +n1+" "+n3+" "+n2);
            }
        } else if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println("Ascending order: " +n2+" "+n1+" "+n3);
            } else {
                System.out.println("Ascending order: " +n2+" "+n3+" "+n1);
            }
        } else if (n3 < n1 && n3 < n2) {
            if (n2 < n1) {
                System.out.println("Ascending order: " +n3+" "+n2+" "+n1);
            } else {
                System.out.println("Ascending order: " +n3+" "+n1+" "+n2);
            }
        }
    }

}