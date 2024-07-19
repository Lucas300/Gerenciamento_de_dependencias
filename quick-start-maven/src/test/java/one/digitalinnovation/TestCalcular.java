package one.digitalinnovation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalcular {

    @Test
    public void testAdd() {
        Calcular calcular = new Calcular();
        int result = calcular.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        Calcular calcular = new Calcular();
        int result = calcular.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }
}

