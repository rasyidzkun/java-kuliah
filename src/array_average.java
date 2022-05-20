public class array_average {
    public static void main(String[] args) {
        int[] angka = {1,6,3,9,7,5,4};
        int total = 0, avg = 0;

        for(int i : angka) {
            total += i;
            avg = total / angka.length;
        }

        System.out.println(total);
        System.out.println(avg);
    }
}
