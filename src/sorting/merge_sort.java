import java.util.Random;

public class merge_sort {
    static void mergeSort(int[] arr) {
        int inputLength = arr.length;

        if(inputLength < 2) return;

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for(int i = 0; i < midIndex; i++) {
            leftHalf[i] = arr[i];
        }

        for(int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(arr, leftHalf, rightHalf);
    }

    static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize) {
            if(leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightSize) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("before: ");
        printArr(arr);
        mergeSort(arr);
        System.out.println("after: ");
        printArr(arr);
    }
}
