import java.util.Scanner;

public class looping_ipk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa : ");
        int jumlahMhs = input.nextInt();

        for(int i = 1; i <= jumlahMhs; i++){
            float ipk = 0;

            System.out.print("Nama mahasiswa " + i + " : ");
            String nama = input.next();

            for(int j = 1; j <= 3; ++j){
                System.out.print("Ip semester " + j + " : ");
                float ip = input.nextFloat();
                ipk += ip / 3;
            }

            System.out.println("Nama mahasiswa : " + nama);
            System.out.println("IPK : " + ipk);
            System.out.println("===================================");
        }
    }
}
