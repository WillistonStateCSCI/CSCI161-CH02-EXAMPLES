//This is an extra example created to demonstrate the Progression Class

public class FibonacciClient {
    public static void main(String[] args) {
        System.out.println("Creating a progression starting at 0:");
        FibonacciProgression prog = new FibonacciProgression(); //Creates a progression starting at 0.
        System.out.println("Printing the first 10 terms of the progression:");
        prog.printProgression(10);

        System.out.println();

        System.out.println("Creating a progression starting with terms 2, 3:");
        FibonacciProgression prog2 = new FibonacciProgression(2, 3); 
        System.out.println("Printing the first 20 terms of the progression:");
        prog2.printProgression(20);
    }
}
