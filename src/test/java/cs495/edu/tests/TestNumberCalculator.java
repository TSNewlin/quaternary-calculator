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
    public void testSubtract(String expected, String numberSubtractedFrom, String numberToSubtract){
        Assertions.assertEquals(expected,numberCalculator.subtract(numberSubtractedFrom, numberToSubtract));
    }
    @ParameterizedTest
    @CsvSource(value = {
            "10,3,1",
            "0,-1,-2",
            "1020,302,112",
            "2202,1123,1013"

    })
    public void testAdd(String expected, String num1, String num2){
        Assertions.assertEquals(expected,numberCalculator.add(num1, num2));
    }
    @ParameterizedTest
    @CsvSource(value = {
            "3,3,1",
            "0,-1,-2",
            "1020,302,112",
            "2202,1123,1013"

    })
    public void testMultiply(String expected, String num1, String num2){
        Assertions.assertEquals(expected,numberCalculator.add(num1, num2));
    }




}
