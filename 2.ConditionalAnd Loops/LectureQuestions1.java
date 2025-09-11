
//Largest of numbers
import java.util.Scanner;

public class LectureQuestions1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the inputs: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is largest.");
        } else if (b > c) {
            System.out.println(b + " is largest.");
        } else {
            System.out.println(c + " is largest.");
        }

        input.close();

    }
}
