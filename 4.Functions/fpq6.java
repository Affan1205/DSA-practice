//To calculate Fibonacci Series up to n numbers.
public class fpq6 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int n = 10;
        for (int i = 2; i < n; i++) {
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}