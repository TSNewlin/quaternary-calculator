package cs495.edu.tests;

import cs495.edu.quaternarycalculator.NumberCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumberCalculator {
    NumberCalculator numberCalculator = new NumberCalculator();
    @Test
    public void subOperatorToTest(){
        Assertions.assertEquals(2,numberCalculator.subOperation("3", "1"));
    }
}
