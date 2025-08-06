public class methodoverloading {

    // Method with two integer parameters
    static int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integer parameters
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calls sum(int, int)
        System.out.println("Sum of 5 + 10 = " + sum(5, 10));

        // Calls sum(int, int, int)
        System.out.println("Sum of 5 + 10 + 20 = " + sum(5, 10, 20));

        // Calls sum(double, double)
        System.out.println("Sum of 5.5 + 10.5 = " + sum(5.5, 10.5));
    }
}
