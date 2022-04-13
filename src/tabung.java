import java.util.Scanner;

public class tabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jari - jari\t : ");
        double jariJari = input.nextDouble();

        System.out.print("Tinggi\t\t : ");
        double tinggi = input.nextDouble();

        double luasPermukaan = 2 * 3.14 * jariJari * (jariJari + tinggi);
        System.out.println("Luas permukaan yang harus di cat : "+ (luasPermukaan * 5));
    }
}
