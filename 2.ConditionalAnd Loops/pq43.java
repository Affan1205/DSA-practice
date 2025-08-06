//Find if a number is palindrome or not
public class pq43 {
    public static void main(String[] args) {
        int n = 1212121;
        int m = n;
        int ans = 0;
        while (n > 0) {
            int digit = n % 10;
            ans = ans * 10 + digit;
            n = n / 10;
        }
        if (ans == m) {
            System.out.println(m + " is palindrome.");
        } else {
            System.out.println(m + " is not a palindrome.");
        }

    }
}
