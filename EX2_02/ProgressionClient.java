//This is an extra example created to demonstrate the Progression Class

public class ProgressionClient {
    public static void main(String[] args) {
        System.out.println("Creating a progression starting at 0:");
        Progression prog = new Progression(); //Creates a progression starting at 0.
        System.out.println("Printing the first 10 terms of the progression:");
        prog.printProgression(10);

        System.out.println();

        System.out.println("Creating a progression starting at 42:");
        Progression prog2 = new Progression(55);
        System.out.println("Printing the first 20 terms of the progression:");
        prog2.printProgression(20);
    }
}
