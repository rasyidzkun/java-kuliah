public class array_matriks2x2 {
    public static void main(String[] args) {
        int[][] matriksA = {{6,5}, {7,4}};
        int[][] matriksB = {{2,3}, {1,3}};
        int[][] pengurangan = new int[2][2];

        for(int i = 0; i < matriksA.length; i++) {
            for(int j = 0; j < matriksB.length; j++) {
                pengurangan[i][j] = matriksA[i][j] - matriksB[i][j];
                System.out.print(pengurangan[i][j] + " ");
            }
            System.out.println();
        }
    }
}
