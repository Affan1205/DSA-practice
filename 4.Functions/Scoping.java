public class Scoping {

    private int globalVar = 10; // class scope

    public void testMethod(int param) { // parameter scope
        int localVar = 20; // method scope
        if (localVar > 0) {
            int blockVar = 30; // block scope
            System.out.println(blockVar); // accessible here
        }
        // blockVar NOT accessible here (outside its block)
        // localVar, param, and globalVar still accessible here
    }
    // localVar, blockVar, and param NOT accessible here
    // Only globalVar is accessible here (within the class)

}
