public class passbyvalue {
    public static void main(String[] args) {
        int a = 50;
        changeValue(a);// passing a copy of a
        System.out.println("value of a: " + a);// no change
    }

    static void changeValue(int x) {
        x = 100;// changing the copy
    }
    // ANALOGY - PHOTOCOPY example
}
