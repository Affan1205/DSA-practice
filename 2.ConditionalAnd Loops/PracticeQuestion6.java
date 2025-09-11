//Calculate Electricity Bill

import java.util.Scanner;

public class PracticeQuestion6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  unit recorded : ");
        float unitRecorded = input.nextFloat();
        System.out.println("Enter the Per unit cosr of electricity: ");
        float perUnitcost = input.nextFloat();
        double electricityBill = unitRecorded * perUnitcost;
        System.out.println("Electricity bill amount is : " + electricityBill);
input.close();
    }
}
