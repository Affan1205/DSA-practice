//check alphabet case

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char alphabet = input.next().charAt(0);
        if (alphabet >= 'a' && alphabet <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("UpperCase");
        }

        input.close();
    }
}
