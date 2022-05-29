public class array_table {
    public static void main(String[] args) {
        String[][] dataMahasiswa = {{"Paijo", "12345", "Kediri"}, {"Waluyo", "12131", "Tulungagung"}, {"Poniran", "13124", "Blitar"}};

        System.out.printf("%-10s%-15s%-10s\n", "Nama", "Alamat", "NPM");
        System.out.printf("%-10s%-15s%-10s\n", "----", "------", "----");
        System.out.printf("%-10s%-15s%-10s\n", dataMahasiswa[0][0] , dataMahasiswa[0][2], dataMahasiswa[0][1]);
        System.out.printf("%-10s%-15s%-10s\n", dataMahasiswa[1][0] , dataMahasiswa[1][2], dataMahasiswa[1][1]);
        System.out.printf("%-10s%-15s%-10s", dataMahasiswa[2][0] , dataMahasiswa[2][2], dataMahasiswa[2][1]);
    }
}
