//This is an extra example created to demonstrate the Progression Class

public class ArithmeticClient {
    public static void main(String[] args) {
        System.out.println("Creating a progression starting at 0:");
        ArithmeticProgression prog = new ArithmeticProgression(); //Creates a progression starting at 0.
        System.out.println("Printing the first 10 terms of the progression:");
        prog.printProgression(10);

        System.out.println();

        System.out.println("Creating a new progression, starting at 0 with stepsize 5");
        ArithmeticProgression prog2 = new ArithmeticProgression(5); //Creates a progression with stepsize 5;
        System.out.println("Printing the first 20 terms of the progression:");
        prog2.printProgression(20);
        
        System.out.println();

        System.out.println("Creating a new progression, starting at 3 with stepsize 2");
        ArithmeticProgression prog3 = new ArithmeticProgression(2, 3); //Creates a progression with start 3 and stepsize 2
        System.out.println("Printing the first 5 terms of the progression:");
        prog3.printProgression(5);
    }
}
