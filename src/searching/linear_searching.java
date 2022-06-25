import java.util.stream.IntStream;

public class linear_searching {
    static int linearSearch(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 100).toArray();
        int value = 8;

        System.out.println(value + " found at index " + linearSearch(arr, value));
    }
}
