//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class jbpq8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = input.next();
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }

        }
        if (isPalindrome) {
            System.out.println("Plaindrome");
        } else {
            System.out.println("not a plaindrome.");
        }
        input.close();
    }
}
