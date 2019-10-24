package app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        int[] numbers = { 1, 5, 2, 3, 7, 8, 4 };
        for (int i : numbers) {
            System.out.print(i);
        }

        reverseArray(numbers);

        System.out.println();

        for (int i : numbers) {
            System.out.print(i);
        }
    }

    private static void reverseArray(int[] array) {
        int maxIndex = array.length - 1;
        int mid = array.length / 2;
        for (int i = 0; i < mid; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
