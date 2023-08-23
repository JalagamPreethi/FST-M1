package Activity;
import java.util.HashMap;
import java.util.Map;

public class Activity11 {

    public static void main(String[] args) {
        Map<Integer, String> colours = new HashMap<>();
        colours.put(1, "Red");
        colours.put(2, "Green");
        colours.put(3, "Blue");
        colours.put(4, "Yellow");
        colours.put(5, "Purple");

        // Print the Map to the console
        System.out.println("The Map is: " + colours);

        // Remove one colour using the remove() method
        colours.remove(3);

        // Check if the colour green exists in the Map using the containsValue() method
        System.out.println("Does the Map contain the colour green? " + colours.containsValue("Green"));

        // Print the size of the Map using the size() method
        System.out.println("The size of the Map is: " + colours.size());
    }
}
