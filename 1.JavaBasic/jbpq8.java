//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class jbpq8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String mySting = input.nextLine();
        int start = 0;
        int end = mySting.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (mySting.charAt(start) != mySting.charAt(end)) {
                isPalindrome = false;
                break;
            } else {
                start++;
                end--;
            }
        }
        if (isPalindrome) {
            System.out.println(mySting + " is a palindrome.");
        } else {
            System.out.println(mySting + " is not a palindrome.");
        }

        input.close();

        // String str = input.next();
        // boolean isPalindrome = true;
        // for (int i = 0; i < str.length() / 2; i++) {
        // if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        // isPalindrome = false;
        // break;
        // }

        // }
        // if (isPalindrome) {
        // System.out.println("Plaindrome");
        // } else {
        // System.out.println("not a plaindrome.");
        // }
    }
}
