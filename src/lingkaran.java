import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lingkaran {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int jari = 0;

        try {
            System.out.print("Masukkan jari - jari\t : ");
            jari = Integer.parseInt(input.readLine());
        } catch (IOException e) {
            System.err.println("Error");
        }

        double luas = 3.14 * (jari * jari);
        double keliling = 2 * 3.14 * jari;

        System.out.println("Luas lingkaran\t\t : " + keliling);
        System.out.println("Keliling lingkaran\t : " + luas);
    }
}
