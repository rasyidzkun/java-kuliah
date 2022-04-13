import java.util.Scanner;

public class switch_lambda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hasil;
        int pilihan = 0;

        System.out.println("Menu:\n1. Pizza\n2. Hamburger\n3. Salad");
        System.out.print("Silahkan pilih menu makanan yang tersedia : ");
        pilihan = input.nextInt();

        switch(pilihan) {
            case 1 -> hasil = "Anda memilih Pizza"; 
            case 2 -> hasil = "Anda memilih Hamburger"; 
            case 3 -> hasil = "Anda memilih Salad"; 
            default -> hasil = "Anda salah memilih menu";
        }
        System.out.println(hasil);

    }
    
}