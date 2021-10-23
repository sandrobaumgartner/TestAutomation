import jdk.jfr.BooleanFlag;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c;

    @BeforeEach
    void setup() {
        c = new Calculator();
    }

    @Test
    void add() {
        double result = c.add(3, 3);
        assertEquals(6, result);
    }

    @Test
    void subtract() {
        double result = c.subtract(6, 3);
        assertEquals(3, result);
    }

    @Test
    void multiply() {
        double result = c.multiply(6, 3);
        assertEquals(18, result);
    }

    @Test
    void divide() {
        double result = c.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    void modulo() {
        double result = c.modulo(8, 3);
        assertEquals(2, result);
    }

    @Test
    void sum() {
        double[] numbers = {3, 3, 4, 5};
        double result = c.sum(numbers);
        assertEquals(15, result);
    }
}