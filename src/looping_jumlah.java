import java.util.Scanner;

public class looping_jumlah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.print("Masukkan batas akhir: ");
        int akhir = input.nextInt();

        for(int i = 1; i <= akhir; i++) {
            total += i;
        }

        System.out.println("total = " + total);
    }
}
