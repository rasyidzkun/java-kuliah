import java.util.Scanner;

public class array_multiplyMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriksA = new int[2][2];
        int[][] matriksB = new int[2][2];
        int[][] multiply = new int[2][2];

        System.out.println("Masukkan elemen matriks pertama");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println( "index dari angka 5 adalah MatriksA[1][1]");   

        System.out.println("Masukkan elemen matriks kedua");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                matriksB[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    multiply[i][j] = multiply[i][j] + matriksA[i][k] * matriksB[k][j];
                }
            }
        }

        System.out.println("Hasil kali matriks");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }
    }
}
