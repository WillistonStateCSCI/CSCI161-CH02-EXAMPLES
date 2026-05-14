//This is an extra example created to demonstrate the Progression Class

public class ProgressionClient {
    public static void main(String[] args) {
        System.out.println("Creating a progression starting at 1:");
        GeometricProgression prog = new GeometricProgression(); //Creates a progression starting at 0.
        System.out.println("Printing the first 10 terms of the progression:");
        prog.printProgression(10);

        System.out.println();

        System.out.println("Creating a progression starting at 1 with base 3:");
        GeometricProgression prog2 = new GeometricProgression(3);//Creates a progression with base 3, starting at 1
        System.out.println("Printing the first 15 terms of the progression:");
        prog2.printProgression(15);

        System.out.println();

        System.out.println("Creating a progression starting at 5 with base 4:");
        GeometricProgression prog3 = new GeometricProgression(4,5);//Creates a progression with base 4, starting at 5
        System.out.println("Printing the first 5 terms of the progression:");
        prog3.printProgression(5);
    }
}
