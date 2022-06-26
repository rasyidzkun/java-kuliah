public class descending_insertionSort {
    static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j-1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 32, 26, 35, 10};
        insertionSort(arr);
        printArray(arr);
    }
}
