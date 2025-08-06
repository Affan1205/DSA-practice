//future investment plan
public class pq44 {
    public static void main(String[] args) {
        double principal = 10000; // Initial amount
        double rate = 0.08; // 8% annual interest
        int years = 10;

        double futureValue = principal * Math.pow(1 + rate, years);
        System.out.println("Future Value: " + futureValue);

    }
}
