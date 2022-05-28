public class method_sumFactorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(sumFactorial(number));
    }

    static int sumFactorial(int num) {
        int factorial = 1, sum = 0;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
            sum += factorial;
        }
        return sum;
    }
}
