public class bubbleSort_binarySearch {
    static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static int binarySearch(int[] arr, int value) {
        int first = 0;
        int last = arr.length - 1;
        
        while(first <= last) {
            int mid = (first + last) / 2;

            if(arr[mid] == value) {
                return mid;
            }else if(arr[mid] < value) {
                first = mid + 1;
            }else {
                last = mid - 1;
            }
        }
        return -1;
    }

    static void printArray(int[] arr) {
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 31, 25, 8, 32, 17};
        int value = 31;
        bubbleSort(arr);
        printArray(arr);
        System.out.println("\nIndex dari angka " + value + " adalah " + binarySearch(arr, value));
    }
}
