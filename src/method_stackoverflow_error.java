public class method_stackoverflow_error {
    public static void main(String[] args) {
        infiniteLoop(30000);
    }

    static void infiniteLoop(int n) {
        if(n == 1) {
            System.out.println("end");
        }else {
            System.out.println("looping ke "+ n);
            infiniteLoop(n - 1);
        }
    }
}
