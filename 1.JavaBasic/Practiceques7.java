//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Practiceques7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        int left = 0;
        int right = str.length() - 1;
        boolean ispalindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                ispalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (ispalindrome) {
            System.out.println(str + " Is palindrome.");
        } else {
            System.out.println(str + " Not a palindrome.");
        }

        
        input.close();
    }
}
