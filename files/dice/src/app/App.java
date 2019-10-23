package app;

import java.util.Scanner;
import java.lang.Math;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Scanner input = new Scanner(System.in);

        int dice1 = 0;
        int dice2 = 0;

        System.out.print("Enter the no. of time you want to through the dice : ");

        int diceThrow = input.nextInt();

        int i = 0;
        int[] countDice = new int[11];

        while (i < diceThrow) {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            int totalDice = dice1 + dice2;

            for (int j = 2, k = 0; j <= 12; j++, k++) {
                if (totalDice == j) {
                    countDice[k]++;
                }
            }

            // switch (totalDice) {
            // case 2:
            // countDice[0]++;
            // break;
            // case 3:
            // countDice[1]++;
            // break;
            // case 4:
            // countDice[2]++;
            // break;
            // case 5:
            // countDice[3]++;
            // break;
            // case 6:
            // countDice[4]++;
            // break;
            // case 7:
            // countDice[5]++;
            // break;
            // case 8:
            // countDice[6]++;
            // break;
            // case 9:
            // countDice[7]++;
            // break;
            // case 10:
            // countDice[8]++;
            // break;
            // case 11:
            // countDice[9]++;
            // break;
            // case 12:
            // countDice[10]++;
            // break;
            // default:
            // break;
            // }
            i++;
        }

        for (int var : countDice) {
            System.out.println(var);
        }

        // 100 millions

        // throw a dice

        // generate random numbers

        // store the total in array

    }
}
