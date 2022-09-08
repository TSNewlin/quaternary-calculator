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

    @ParameterizedTest
    @CsvSource(delimiter = '|', value = {
            "3102 | 210",
            "31032 | 846",
            "1321 | 121",
            "10321231 | 20077"
    })
    public void testToQuaternary(String expected, int baseTen) {
        Assertions.assertEquals(expected, QuaternaryConverter.toQuaternary(baseTen));
    }
}
