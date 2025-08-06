//Write a program that will ask the user to enter his/her marks (out of 100). 
//Define a method that will display grades according to the marks entered as below:

import java.util.Scanner;

public class pq8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total subject: ");
        int n = in.nextInt();
        System.out.println("Enter number marks obtained: ");
        int marksObtained = 0;
        int totalmarks = 500;
        for (int i = 0; i < n; i++) {
            int maks = in.nextInt();
            marksObtained = marksObtained + maks;

        }
        double percentage = (marksObtained * 100) / totalmarks;
        System.out.println(percentage);
        grade(percentage);
        in.close();
    }

    static void grade(double a){
        if (a > 90) {
            System.out.println("A");
        } else if (a > 80) {
            System.out.println("B");
        } else if (a > 70) {
            System.out.println("C");
        } else if (a > 60) {
            System.out.println("D");
        } else if (a > 50) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}
