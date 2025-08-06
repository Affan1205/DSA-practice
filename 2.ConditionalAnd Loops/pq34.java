//Calculate Depreciation of Value
//Depreciation per year= (Cost of Asset−Scrap Value)/Useful Life (year)

import java.util.Scanner;

public class pq34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cost_of_asset = input.nextDouble();
        double scrap_value = input.nextDouble();
        int Useful_year = input.nextInt();
        double Depreciation = (cost_of_asset - scrap_value) / Useful_year;
        System.out.println("Depriciation : " + Depreciation);
        input.close();
    }
}
