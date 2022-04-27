import java.util.Scanner;

public class uts_percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = "";
        int item, jumlahItem, jumlahBeli = 0;;
        double harga = 0, totalHarga = 0, hargaFinal = 0;

        System.out.println("1. Pensil 2B\t: Rp. 4.000\n2. Pulpen\t: Rp. 8.500\n3. Buku Tulis\t: Rp. 5.000\n4. Spidol\t: Rp. 10.000");
        System.out.println("=============================");
        System.out.print("Jumlah item yang dibeli : ");
        jumlahItem = input.nextInt();

        for(int i = 1; i <= jumlahItem; i++) {
            System.out.print("Masukkan nomor item yang mau dibeli : ");
            item = input.nextInt();

            System.out.print("Jumlah pembelian : ");
            jumlahBeli = input.nextInt();

            switch(item) {
                case 1: 
                    nama = "Pensil 2B";
                    harga = 4_000;
                    break;
                case 2:
                    nama = "Pulpen";
                    harga = 8_500;
                    break;
                case 3:
                    nama = "Buku Tulis";
                    harga = 5_000;
                    break;
                case 4:
                    nama = "Spidol";
                    harga = 10_000;
                    break;
                default :
                    System.out.println("Maaf item tersebut tidak tersedia");
            }

            totalHarga = harga * jumlahBeli;
            hargaFinal += totalHarga;

            if(jumlahBeli > 10) {
                hargaFinal -= (0.05 * totalHarga );
            }

            if(totalHarga <= 150_000) {
                hargaFinal -= (0.05 * totalHarga);
            }else if (totalHarga <= 250_000) {
                hargaFinal -= (0.1 * totalHarga);
            }else if(totalHarga > 250_000) {
                hargaFinal -= (0.15 * totalHarga);
            }

        }

        System.out.println("=============================================");
        System.out.println("Jumlah uang yang harus dibayarkan : " +hargaFinal);
    }
}
