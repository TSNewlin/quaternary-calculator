package cs495.edu.tests;

import cs495.edu.quaternarycalculator.QuaternaryConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestQuaternaryConverter {
    @ParameterizedTest
    @CsvSource(delimiter = '|', value = {
            "210 | 3102",
            "846 | 31032",
            "121 | 1321",
            "20077 | 10321231"
    })
    public void testToDecimal(int expected, String quaternary) {
        Assertions.assertEquals(expected, QuaternaryConverter.toDecimal(quaternary));
    }
}
