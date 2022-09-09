package cs495.edu.tests;

import cs495.edu.quaternarycalculator.NumberCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestNumberCalculator {
    NumberCalculator numberCalculator = new NumberCalculator();

    @ParameterizedTest
    @CsvSource(value = {
            "2,3,1",
            "0,1,2",
            "130,302,112",
            "110,1123,1013"

    })
    public void subtractTest(String expected, String numberSubtracted, String numberToSubtract){
        Assertions.assertEquals(expected,numberCalculator.subtract(numberSubtracted, numberToSubtract));
    }





}
