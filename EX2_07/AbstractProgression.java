//Code Fragment 2.12 in Textbook
//There are only two differences between this and Progression.java
//The first difference is the abstract modifier on line 5.
//The second is the abstract modifier on the advance method on line 23.
public abstract class AbstractProgression {
    protected long current;
    public AbstractProgression(){this(0);}
    public AbstractProgression(long start){current = start;}

    public long nextValue(){// this is a concrete method
        long answer = current;
        advance(); //this protected call is responsible for advancing the current value;
        return answer;
    }

    public void printProgression(int n){ //this is a concrete method
        System.out.println(nextValue()); //print first value without leading space
        for(int j=1;j<n;j++){
            System.out.print(" "+nextValue()); //print leading space before others
        }
        System.out.println(); //End the line
    }
    protected abstract void advance();
}
