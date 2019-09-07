
// Program that calculates area, circumference
// and diameter for a circle.
import java.util.Scanner;

public class Circle 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int radius; // radius of circle

      System.out.print("Enter radius: "); // prompt for input
      radius = input.nextInt(); // read number

      System.out.printf("Diameter is %d%n", (2 * radius)); 
      System.out.printf("Circumference is %f%n", 
         (2 * Math.PI * radius));
      System.out.printf("Area is %f%n", (Math.PI * radius * radius)); 
   } // end main
} // end class Circle

