package Activity;


public class Activity2 {
        public static void main(String[] args) {
            // Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]
            int[] array = {10, 77, 10, 54, -11, 10};

            // Find the 10's in the array and add them
            int sumOf10s = 0;
            for (int number : array) {
                if (number == 10) {
                    sumOf10s += number;
                }
            }

            // Check if value is equal to 30
            if (sumOf10s == 30) {
                System.out.println("The sum of all the 10's in the array is 30==True.");
            } else {
                System.out.println("The sum of all the 10's in the array is not 30==False.");
            }

        }
    }



