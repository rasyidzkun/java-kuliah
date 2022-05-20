public class array_matriks3x3 {
    public static void main(String[] args) {
        int[][] matriksA = {{2,4,3}, {1,5,2}, {6,4,7}};
        int[][] matriksB = {{7,3,5}, {8,2,1}, {6,9,4}};
        int[][] penjumlahan = new int[3][3];

        for(int i = 0; i < matriksA.length; i++) {
            for(int j = 0; j < matriksB.length; j++) {
                penjumlahan[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.printf(penjumlahan[i][j] + " ");
            }
            System.out.println();
        }
    }
}
