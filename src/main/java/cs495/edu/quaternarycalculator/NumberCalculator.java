package cs495.edu.quaternarycalculator;

import java.util.Scanner;

public class NumberCalculator {
    public String subOperation(String quaternary1, String quaternary2){
        int num1 = Integer.parseInt(quaternary1, 4);
        int num2 = Integer.parseInt(quaternary2, 4);
        int finalTotal = num1 - num2;

        if (finalTotal < 0){
            finalTotal = -finalTotal;
            return "-" + Integer.toString(finalTotal, 4);
        }else{
            return Integer.toString(finalTotal, 4);
        }
    }
}
