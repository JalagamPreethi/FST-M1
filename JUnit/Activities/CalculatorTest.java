package Examples;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void additionTest() {

        int result = calc.add(10,5);
        System.out.println("Sum is:" + result);
    }
    @Test
    public void multiplyTest() {

        int result = calc.multiply(2,5);
        System.out.println("Product is:" + result);
    }
}
