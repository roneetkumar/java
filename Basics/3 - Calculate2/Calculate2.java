
import java.util.Scanner;

public class Calculate2 {
   private static Scanner input;

   public static void main(String[] args) {
      input = new Scanner(System.in);

      int number1; // first number
      int number2; // second number
      int number3; // third number
      int largest; // largest value
      int smallest; // smallest value
      int sum; // sum of numbers
      int product; // product of numbers
      int average; // average of numbers

      System.out.print("Enter first integer: "); // prompt for input
      number1 = input.nextInt(); // read first number
      System.out.print("Enter second integer: "); // prompt for input
      number2 = input.nextInt(); // read second number
      System.out.print("Enter third integer: "); // prompt for input
      number3 = input.nextInt(); // read third number

      // determine largest value
      largest = number1; // assume number1 is the largest

      if (number2 > largest) // determine whether number2 is larger
         largest = number2;

      if (number3 > largest) // determine whether number3 is larger
         largest = number3;

      // determine smallest value
      smallest = number1; // assume number1 is the smallest

      if (number2 < smallest) // determine whether number2 is smallest
         smallest = number2;

      if (number3 < smallest) // determine whether number3 is smallest
         smallest = number3;

      // perform calculations
      sum = number1 + number2 + number3;
      product = number1 * number2 * number3;
      average = sum / 3;

      // print results
      System.out.printf("%nFor the numbers %d, %d and %d%n", number1, number2, number3);
      System.out.printf("Largest is %d%n", largest);
      System.out.printf("Smallest is %d%n", smallest);
      System.out.printf("Sum is %d%n", sum);
      System.out.printf("Product is %d%n", product);
      System.out.printf("Average is %d%n", average);
   } // end main
} // end class Calculate2
