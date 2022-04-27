public class uts_loopingU {
    public static void main(String[] args) {
        int n = 5;
        for(int baris = 1; baris <= n; baris++) {
            for(int kolom = 1; kolom <= n; kolom++) {
                if(kolom == 1 || kolom == n || baris == n) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}