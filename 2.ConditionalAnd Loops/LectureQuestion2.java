//Alphabet check case

import java.util.Scanner;

public class LectureQuestion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        char ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.print(ch + " is Lowercase.");
        } 
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.print(ch + " is Uppercase.");
        }
        else{
            System.out.println("Input is other the alphabet.");
        }
        input.close();
    }
}
