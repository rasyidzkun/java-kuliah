import java.util.Arrays;

public class method_arguments {
    public static void main(String[] args) {
        sortingArray(12,8,71,45,3,11);
    }

    static void sortingArray(int... arr) {
        int max = 0, min = 0;

        Arrays.sort(arr);
        for(int i : arr) {
            max = arr[arr.length - 1];
            min = arr[0];
            System.out.println(i);
        }

        System.out.println("max = " +max);
        System.out.println("min = " +min);
    }
}
