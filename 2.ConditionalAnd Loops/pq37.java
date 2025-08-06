//Compound Interest Java Program
public class pq37 {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5; // annual interest rate in %
        double time = 3; // time in years
        int n = 1; // compounded annually

        double amount = principal * Math.pow(1 + (rate / 100) / n, n * time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest: " + compoundInterest);
        System.out.print("Total Amount: " + amount);
    }
}
