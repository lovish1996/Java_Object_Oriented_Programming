package source_code.labsheet_4;

/**
 * Initialization of 2D array
 */
public class TwoDExample {
    public static void main(String[] args) {
        int[][] multiDimensional1 = new int[5][10];
        int[][] multiDimensional2 = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] multiDimensional3 = new int[5][];

        for (int i = 0; i < 5; i++) {
            multiDimensional3[i] = new int[10];
        }

        int[][] multiDimensional4 = new int[5][];
        multiDimensional4[0] = new int[10];
        multiDimensional4[1] = new int[10];
        multiDimensional4[2] = new int[10];
        multiDimensional4[3] = new int[10];
        multiDimensional4[4] = new int[10];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multiDimensional2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
