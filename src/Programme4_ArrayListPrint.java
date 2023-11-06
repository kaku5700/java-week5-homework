import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Programme4_ArrayListPrint {
    public static void main(String[] args) {
        // Creating ArrayList of Colours
        ArrayList<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Black");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Magenta");
        // For each loop getting values and assigning to colour object and printing it
        for (Object colour : colours) {
            System.out.println(colour);
        }
    }
}
