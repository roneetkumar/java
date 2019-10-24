package app;

import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Count : ");
        int count = input.nextInt();
        int[] numbers = readIntegers(count);
        System.out.println("Min value is : " + findMin(numbers));
    }

    public static int[] readIntegers(int count) {
        int[] numbers = new int[count];
        System.out.println("Enters numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
