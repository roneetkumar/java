package app;

public class App {
    public static void main(String[] args) {

        // int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] b = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        int a[][] = { { 1, 2 }, { 2, 1 } };
        int b[][] = { { 2, 1 }, { 1, 2 } };

        int size = a.length;
        int[][] c = { {} };
        c = new int[size][size];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println(c[i][j]);
            }
        }
    }
}
