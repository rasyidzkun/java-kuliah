import java.util.Scanner;

public class uts_perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kartuPelanggan, lowerKp, cobaLagi, lowerCoba ;
        int jumlahBuku = 0, harga = 0, hargaTotal = 0;

        System.out.println("***Selamat datang di percetakan Sinar Abadi***");
        System.out.println("==============================================");

        do {
            System.out.print("Apakah anda punya kartu pelanggan? (ya/tidak) : ");
            kartuPelanggan = input.next();
            lowerKp = kartuPelanggan.toLowerCase();

            if(lowerKp.equals("ya")) {
                System.out.println("Terimakasih sudah menjadi pelanggan kami");
                harga = 9_000;
            }else{
                if(jumlahBuku < 100) {
                    harga = 15_000;
                }else if(jumlahBuku >= 100 && jumlahBuku <= 200) {
                    harga = 12_000;
                } else if(jumlahBuku > 200) {
                    harga = 10_000;
                }
            }

            System.out.print("Jumlah buku : ");
            jumlahBuku = input.nextInt();
            System.out.println("Jumlah buku dicetak : " + jumlahBuku);

            hargaTotal = jumlahBuku * harga;
            System.out.println("Harga yang harus dibayar: "  + hargaTotal);
            
            System.out.print("Coba lagi? (ya/tidak) : ");
            cobaLagi = input.next();
            lowerCoba = cobaLagi.toLowerCase();

            System.out.println("==============================================");

        }while(lowerCoba.equals("ya"));

        System.out.println("Terimakasih");
    }
}
