
package Examples;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;




public class AssertTest {
    @Test
    void iterablesEqual() {
        final List<String> list = Arrays.asList("orange", "mango", "banana");
        final List<String> expected = Arrays.asList("banana", "mango", "orange");

        // Add a new value
        list.add("apple");
        // Sort array
        Collections.sort(list);

        // Assertion
        assertIterableEquals(expected, list); //Fail
    }
}