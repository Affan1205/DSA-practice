//Largest of numbers

import java.util.Scanner;

public class practise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Max : " + max);
        input.close();
    }
}
