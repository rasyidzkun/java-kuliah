import java.util.Scanner;

public class looping_ganjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int awal = input.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int akhir = input.nextInt();

        for(int i = awal; i <= akhir; i++){
            if(i % 2 == 0) {
                System.out.println(i + " = genap");
            }else {
                System.out.println(i + " = ganjil");
            }
        }
    }
}
