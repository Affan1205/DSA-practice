//Find if a number is palindrome or not
public class PracticeQuestion12 {
    public static void main(String[] args) {
        int num = 666666;
        int temp = num;
        int ans = 0;
        while (num > 0) {
            int digit = num % 10;
            ans = ans * 10 + digit;
            num = num / 10;
        }
        if (ans == temp)
            System.out.println(ans + " is a Palindrome.");
        else
            System.out.println("not a palindrome.");
    }
}
