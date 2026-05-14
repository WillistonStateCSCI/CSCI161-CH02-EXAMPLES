//Client to generate sellable photographs
public class PhotoClient {
    public static void main(String[] args) {
    Photograph photo1 = new Photograph("The Art Museum", 7500, true);
    System.out.println("Description: "+photo1.description());
    System.out.println("Price: "+photo1.listPrice());
    System.out.println("Lowest Price: "+photo1.lowestPrice());
    System.out.println("Color? "+photo1.isColor());
    }
}
