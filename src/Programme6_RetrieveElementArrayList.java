import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Programme6_RetrieveElementArrayList {
    public static void main(String[] args) {

        // Creating ArrayList of Colours
        List<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Black");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Magenta");

        String element = colours.get(1);
        System.out.println("Second element stored in Array is: " + element);
        element = colours.get(3);
        System.out.println("Fourth element stored in Array is: " + element);
    }
}
