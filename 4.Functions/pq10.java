//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class pq10 {
    public static void main(String[] args) {
     isPalindrome(12121);
    }

    static void isPalindrome(int a) {
        int check = a;
        int ans = 0;

        while (a > 0) {
            int digit = a % 10;
            ans = ans * 10 + digit;
            a = a / 10;
        }
        if (ans == check) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("not a palindrome.");
        }
    }
}
