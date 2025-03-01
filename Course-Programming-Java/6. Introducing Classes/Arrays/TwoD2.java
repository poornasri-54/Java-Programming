public class TwoD2 {
    // Manually allocate differing size second dimension
    public static void main(String[] args) {
        int[][] twoD = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, a = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                twoD[i][j] = a*2;
                a++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}
/* output : 0 
            2 4
            6 8 10
            12 14 16 18 */
