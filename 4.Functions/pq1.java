//Define two methods to print the maximum and the minimum number respectively 
//among three numbers entered by the user.

import java.util.Scanner;

public class pq1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int maximum = max(num1, num2, num3);
        System.out.println("Maximum of given i/p is : " + maximum);
        int minimum = min(num1, num2, num3);
        System.out.println("Minimum of given i/p is : " + minimum);
        input.close();
    }

    static int max(int a, int b, int c) {
        int maxi = a;
        if (b > maxi) {
            maxi = b;
        } else if (c > maxi) {
            maxi = c;
        }
        return maxi;
    }

    static int min(int a, int b, int c) {
        int mini = a;
        if (b < mini) {
            mini = b;
        } else if (c < mini) {
            mini = c;
        }
        return mini;
    }
}


