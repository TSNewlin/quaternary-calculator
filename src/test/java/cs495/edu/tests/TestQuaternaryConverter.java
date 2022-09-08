package cs495.edu.tests;

import cs495.edu.quaternarycalculator.QuaternaryConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuaternaryConverter {
    @Test
    public void testToDecimal() {
        Assertions.assertEquals(210, QuaternaryConverter.toDecimal("3102"));
    }
}
