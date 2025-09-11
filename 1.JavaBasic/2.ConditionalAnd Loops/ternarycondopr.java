public class ternarycondopr {
    public static void main(String[] args) {
        // Ternary (conditional) operator - A concise form of if-else that returns a
        // value.
        // result = (condition) ? valueIfTrue : valueIfFalse;

        // Example:
        // String message = (a > 0) ? "Positive" : "Not positive";

        int num = 8;
        String evenOrOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);
        // Output: Even

    }
}
