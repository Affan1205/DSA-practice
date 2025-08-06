//Sum Of A Digits Of Number
public class pq50 {
    public static void main(String[] args) {
        int n = 7867;
        int m = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println("Sum Of A Digits Of " + m + " is " + sum);
    }
}
