package Activity;
import java.util.ArrayList;

public class Activity9 {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("John Doe");
        myList.add("Jane Doe");
        myList.add("Mary Smith");
        myList.add("Peter Jones");
        myList.add("David Williams");

        // Print all the names using for loop
        for (String name : myList) {
            System.out.println(name);
        }

        // Use get() method to retrieve the 3rd name in the ArrayList
        System.out.println("The 3rd name is: " + myList.get(2));

        // Use contains() method to check if a name exists in the ArrayList
        System.out.println("Does the list contain 'Jane Doe'? " + myList.contains("Jane Doe"));

        // Use size() method to print the number of names in the ArrayList
        System.out.println("The number of names in the list is: " + myList.size());

        // Use remove() method to remove a name from the list and print the size() of the list again
        myList.remove("Mary Smith");
        System.out.println("The number of names in the list after removing 'Mary Smith' is: " + myList.size());
    }
}

