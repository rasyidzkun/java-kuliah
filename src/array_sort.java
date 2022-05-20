import java.util.Arrays;

public class array_sort {
    public static void main(String[] args) {
        int[] num = {12,8,100,-45,3,-1};
        int max = 0,min = 0;
        Arrays.sort(num);

        for(int i : num) {
            System.out.println(i);
            max = num[num.length - 1];
            min = num[0];
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
