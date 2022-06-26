public class insertion_sort {
    static void inseriionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            } 
        }
    }

    static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8,10};
        inseriionSort(arr);
        printArr(arr);
    }
}
