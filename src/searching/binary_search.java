import java.util.stream.IntStream;

public class binary_search {
    static int binarySearch(int[] arr, int value) {
        int first = 0;
        int last = arr.length -1;

        while(first <= last) {
            int mid = (first + last) / 2;
            if(arr[mid] == value) {
                return mid;
            } else if(arr[mid] < value) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 100).toArray();
        int value = 67;

        System.out.println(value + " found at index " + binarySearch(arr, value));
    }
}
