package arrays;

public class JaggedArray {
    /*
    int[][] jagged = new int[3][]; // 3 rows, columns yet to be defined

// Row 0 has 2 columns
jagged[0] = new int[]{1, 2};

// Row 1 has 4 columns
jagged[1] = new int[]{3, 4, 5, 6};

// Row 2 has 1 column
jagged[2] = new int[]{7};

     */

    public static void main(String[] args) {
      /*  int[][] jagged = new int[3][]; //Columns yet to be defined
        jagged[0] = new int[] {1,2};
        jagged[1] = new int[] {3,4,5,6};
        jagged[2] = new int[] {7}; */
        int[][] jagged = {
            {10, 20, 30},
            {40, 50},
            {60, 70, 80, 90}
        };

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

    }
}
