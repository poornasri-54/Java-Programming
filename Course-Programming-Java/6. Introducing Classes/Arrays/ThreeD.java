// Demonstrate a three-dimensional array.
class ThreeD {
    public static void main(String[] args) {
        int[][][] threeD = new int[3][4][5];
        int i, j, k;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    threeD[i][j][k] = i+j+k;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++)
                    System.out.print(threeD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
/*output :  0 1 2 3 4 
            1 2 3 4 5
            2 3 4 5 6
            3 4 5 6 7

            1 2 3 4 5
            2 3 4 5 6
            3 4 5 6 7
            4 5 6 7 8

            2 3 4 5 6
            3 4 5 6 7
            4 5 6 7 8
            5 6 7 8 9 */