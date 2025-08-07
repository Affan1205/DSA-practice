//Write a program that will ask the user to enter his/her marks (out of 100). 
//Define a method that will display grades according to the marks entered as below:

import java.util.Scanner;

public class pq8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total subjects : ");
        int subjects = input.nextInt();
        System.out.print("Total marks of exam: ");
        int totalMarks = input.nextInt();
        int markObtained = 0;
        System.out.println("Enter the marks : ");
        for (int i = 0; i < subjects; i++) {
            int marks = input.nextInt();
            markObtained = markObtained + marks;
        }
        System.out.println("Marks obtained: " + markObtained);
        input.close();
        double percentage = (markObtained * 100) / totalMarks;
        System.out.println("Percentage obtained: " + percentage);

        gradeObtained(percentage);
    }

    static void gradeObtained(double percent) {
        if (percent > 90) {
            System.out.println("A");
        } else if (percent > 75) {
            System.out.println("B");
        } else if (percent > 60) {
            System.out.println("C");
        } else if (percent > 40) {
            System.out.println("D");
        } else {
            System.out.println("Fail!!!!!");
        }
    }
}