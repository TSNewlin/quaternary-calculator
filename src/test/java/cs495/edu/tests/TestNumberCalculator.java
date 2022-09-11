package cs495.edu.tests;

import cs495.edu.quaternarycalculator.NumberCalculator;
import org.junit.jupiter.api.Assertions;
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
            "2,-1,-2",
            "11011,0011,1001",
            "101030,302,112"

    })
    public void testMultiply(String expected, String num1, String num2){
        Assertions.assertEquals(expected,numberCalculator.multiply(num1, num2));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "3,3,1",
            "undefined,2,0",
            "1,11,11",
            "2,302,112",
            "1130,1111111,323",
            "2,13,3"
    })
    public void testDivide(String expected, String numerator, String denominator){
        Assertions.assertEquals(expected,numberCalculator.divide(numerator, denominator));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "210,12",
            "11221,103",
            "121,11",
            "3010,32"
    })
    public void testSquared(String expected, String numberSquared){
        Assertions.assertEquals(expected,numberCalculator.squared(numberSquared));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0,0",
            "32,3020",
            "123,23121",
            "10,100"

    })
    public void testSquareRoot(String expected, String numberSquareRooted){
        Assertions.assertEquals(expected,numberCalculator.squareRoot(numberSquareRooted));
    }
}
