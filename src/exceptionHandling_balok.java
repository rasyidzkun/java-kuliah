import java.util.Scanner;

public class exceptionHandling_balok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
        System.out.print("Panjang: ");
        int panjang = input.nextInt();

        System.out.print("Lebar: ");
        int lebar = input.nextInt();

        System.out.print("Tinggi: ");
        int tinggi = input.nextInt();
        
        System.out.println(volumeBalok(panjang, lebar, tinggi));
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    static int volumeBalok(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }
}
