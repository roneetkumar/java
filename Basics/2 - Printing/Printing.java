
// Prints the numbers 1 through 4 several ways.

public class Printing 
{
   public static void main(String[] args)
   {
      System.out.print("Part (a): ");

      // one System.out.println statement
      System.out.println("1 2 3 4");

      System.out.print("Part (b): ");

      // four System.out.print statements
      System.out.print("1 ");
      System.out.print("2 ");
      System.out.print("3 ");
      System.out.print("4");
      System.out.println();

      System.out.print("Part (c): ");

      // one System.out.printf statement
      System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
   } // end main
} // end class Printing


