import java.util.Scanner;

public class exceptionHandling_login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = "Rasyid", username = "";
        int password = 152, passwordInput = 0;

        do {
            try {
                System.out.print("Nama: ");
                username = input.next();

                System.out.print("Password: ");
                passwordInput = input.nextInt();
            }catch(Exception e) {
                System.out.println(e);
                System.out.println("Input anda salah");
            }
        }while(!username.equals(nama) || passwordInput != password);

        System.out.println("Berhasil Login");
    }
}
