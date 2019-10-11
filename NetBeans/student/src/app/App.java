package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Scanner input = new Scanner(System.in);

        int[] grades = new int[4];
        int marks = 0;

        for (int i = 0; i < 4; i++) {

            do {
                marks = input.nextInt();
            } while (marks <= 0 || marks > 100);

            if (marks >= 40) {
                grades[2]++;
            } else if (marks > 60) {
                grades[1]++;
            } else if (marks > 80) {
                grades[0]++;
            } else {
                grades[3]++;
            }
        }

        for (int var : grades) {
            System.out.println(var);
        }

    }
}
