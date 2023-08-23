package Activity;
interface Addable {

    int add(int num1, int num2);
}

public class Activity12 {

    public static void main(String[] args) {
        Addable ad1 = (a, b) -> (a + b);
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };

        System.out.println("The result of ad1 is: " + ad1.add(10, 20));
        System.out.println("The result of ad2 is: " + ad2.add(10, 200));
    }
}

