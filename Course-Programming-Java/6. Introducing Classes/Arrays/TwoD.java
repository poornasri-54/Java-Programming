// Demonstrate a two-dimensional array.
class TwoD{
    public static void main(String[] args) {
        int[][] twoD = new int[3][3];
        int i, j, a = 0;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                twoD[i][j] = a*2;
                a++;
            }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}
/*output :  0 2 4 
            6 8 10
            12 14 16 */
