package app;

public class Zoo {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        int[][] IntArray = new int[10][10];
        for (int i = 0; i < IntArray.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < IntArray[i].length; j++) {
                if (i == j) {
                    IntArray[i][j] = 1;
                } else if (i + j == 9) {
                    IntArray[i][j] = 1;
                }
                System.out.print(IntArray[i][j] + " ");
            }
        }
    }
}
