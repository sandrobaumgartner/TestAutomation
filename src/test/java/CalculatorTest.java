import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator c = new Calculator();
        double result = c.add(3, 3);
        assertEquals(6, result);
    }

    @Test
    void subtract() {
        Calculator c = new Calculator();
        double result = c.subtract(6, 3);
        assertEquals(3, result);
    }

    @Test
    void multiply() {
        Calculator c = new Calculator();
        double result = c.multiply(6, 3);
        assertEquals(18, result);
    }

    @Test
    void divide() {
        Calculator c = new Calculator();
        double result = c.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    void modulo() {
        Calculator c = new Calculator();
        double result = c.modulo(8, 3);
        assertEquals(2, result);
    }

    @Test
    void sum() {
        Calculator c = new Calculator();
        double[] numbers = {3, 3, 4, 5};
        double result = c.sum(numbers);
        assertEquals(15, result);
    }
}