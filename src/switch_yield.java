import java.util.Scanner;

public class switch_yield {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan = 0;
        String hasil;

        System.out.println("Menu:\n1. Pizza\n2. Hamburger\n3. Salad");
        System.out.print("Silahkan pilih menu makanan yang tersedia : ");
        pilihan = input.nextInt();

        hasil = switch (pilihan) {
            case 1 : yield "Anda memilih Pizza";
            case 2 : yield "Anda memilih Hamburger";
            case 3 : yield "Anda memilih Salad";
            default : yield "Anda salah memilih menu";
        };

        System.out.println(hasil);
    }
}
