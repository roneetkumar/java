
// Program accepts five numbers as input and prints a tally of the 
// number of negatives, positives and zeros.
import java.util.Scanner;

public class Tally 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int inputNumber;
      int zeroTally;
      int positiveTally;
      int negativeTally;

      // initialize counters
      zeroTally = 0;
      positiveTally = 0;
      negativeTally = 0;

      System.out.print("Enter first integer: "); // prompt for input
      inputNumber = input.nextInt(); // read first number

      if (inputNumber == 0)
         zeroTally = zeroTally + 1;

      if (inputNumber < 0)
         negativeTally = negativeTally + 1;

      if (inputNumber > 0)
         positiveTally = positiveTally + 1;

      System.out.print("Enter second integer: "); // prompt for input
      inputNumber = input.nextInt(); // read second number

      if (inputNumber == 0)
         zeroTally = zeroTally + 1;

      if (inputNumber < 0)
         negativeTally = negativeTally + 1;

      if (inputNumber > 0)
         positiveTally = positiveTally + 1;

      System.out.print("Enter third integer: "); // prompt for input
      inputNumber = input.nextInt(); // read third number

      if (inputNumber == 0)
         zeroTally = zeroTally + 1;

      if (inputNumber < 0)
         negativeTally = negativeTally + 1;

      if (inputNumber > 0)
         positiveTally = positiveTally + 1;

      System.out.print("Enter fourth integer: "); // prompt for input
      inputNumber = input.nextInt(); // read fourth number

      if (inputNumber == 0)
         zeroTally = zeroTally + 1;

      if (inputNumber < 0)
         negativeTally = negativeTally + 1;

      if (inputNumber > 0)
         positiveTally = positiveTally + 1;

      System.out.print("Enter fifth integer: "); // prompt for input
      inputNumber = input.nextInt(); // read fifth number

      if (inputNumber == 0)
         zeroTally = zeroTally + 1;

      if (inputNumber < 0)
         negativeTally = negativeTally + 1;

      if (inputNumber > 0)
         positiveTally = positiveTally + 1;

      // create a string describing the results
      System.out.printf("There are %d negative numbers%n", 
         negativeTally);
      System.out.printf("There are %d positive numbers%n", 
         positiveTally);
      System.out.printf("%nThere are %d zeros%n", zeroTally);
   } // end main 
} // end class Tally

