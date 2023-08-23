package Activity;
import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("M");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("M");
        hs.add("X");

        // Print the size of the HashSet using the size() method
        System.out.println("The size of the HashSet is: " + hs.size());

        // Remove an element using the remove() method
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        //Remove element that is not present
        if(hs.remove("Z")) {
            System.out.println("Z removed from the Set");
        } else {
            System.out.println("Z is not present in the Set");
        }

        // Use the contains() method to check if an item is in the Set or not
        System.out.println("Does the set contain 'A'? " + hs.contains("A"));

        // Print the updated set
        System.out.println("The updated set is: " + hs);
    }
}

