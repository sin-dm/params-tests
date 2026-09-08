import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Junit4ParametrizedTest {

    int firstNumber;

    int secondNumber;

    int expected;

    public Junit4ParametrizedTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] parameters() {
        return new Object[][] {
                {1, 2, 3},
                {2, 2, 4},
                {5, 5, 10}
        };
    }

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    public void nonParamTest() {
        System.out.println("non param test");
    }

}
