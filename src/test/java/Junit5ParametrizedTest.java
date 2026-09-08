//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.*;
//
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class Junit5ParametrizedTest {
//
//    @ParameterizedTest
//    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9 })
//    public void testSum(int x) {
//        System.out.println("PARAMETER x IS: " + x);
//        Calculator calculator = new Calculator();
//        int result = calculator.sum(x, 1);
//        assertEquals(3, result);
//    }
//
//    @ParameterizedTest
//    @NullAndEmptySource
//    public void testSum1(String str) {
//        assertTrue(str.isBlank());
//    }
//
//    @ParameterizedTest
//    @CsvSource({"1, 1, 2", "2, 2, 4"})
//    public void testSumCsv(int x, int y, int expected) {
//            Calculator calculator = new Calculator();
//            int result = calculator.sum(x, y);
//            assertEquals(expected, result);
//    }
//
//    @ParameterizedTest(name = "Test round: {index} | sum {0} with {1}. Expected result: {2}")
//    @MethodSource("numbersForCalculator")
//    public void testSumMethod(int firstNumber, int secondNumber, int expectedResult) {
//        Calculator calculator = new Calculator();
//        int result = calculator.sum(firstNumber, secondNumber);
//        assertEquals(expectedResult, result);
//
//    }
//
//    public static Stream<Arguments> numbersForCalculator() {
//        return Stream.of(
//                Arguments.arguments(1, 2, 3),
//                Arguments.arguments(2, 2, 4),
//                Arguments.arguments(5, 5, 10)
//        );
//    }
//}
