//pythagoras triplet
public class pq11 {
    public static void main(String[] args) {
        isPythagoresTriplet(4, 3, 5);
    }

    static void isPythagoresTriplet(int a, int b, int c) {
        if ((a * a + b * b) == c * c) {
            System.out.println("Is a pythagores triplet.");
        } else {
            System.out.println("not a pythagores triplet.");
        }
    }
}
