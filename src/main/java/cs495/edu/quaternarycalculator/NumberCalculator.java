package cs495.edu.quaternarycalculator;

public class NumberCalculator {
    public String subtract(String quaternary1, String quaternary2){
        int num1 = Integer.parseInt(quaternary1, 4);
        int num2 = Integer.parseInt(quaternary2, 4);
        int finalTotal = num1 - num2;

        if (finalTotal < 0){
            return "0";
        }else{
            return Integer.toString(finalTotal, 4);
        }
    }

    public String add(String quaternary1, String quaternary2){
        int num1 = Integer.parseInt(quaternary1, 4);
        int num2 = Integer.parseInt(quaternary2, 4);
        int finalTotal = num1 + num2;

        if (finalTotal < 0){
            return "0";
        }else{
            return Integer.toString(finalTotal, 4);
        }
    }

    public String multiply(String quaternary1, String quaternary2) {
        int num1 = Integer.parseInt(quaternary1, 4);
        int num2 = Integer.parseInt(quaternary2, 4);
        int finalTotal = num1 * num2;

        if (finalTotal < 0) {
            return "0";
        } else {
            return Integer.toString(finalTotal, 4);
        }
    }

    public String divide(String quaternary1, String quaternary2) {
        int num1 = Integer.parseInt(quaternary1, 4);
        int num2 = Integer.parseInt(quaternary2, 4);
        if (num2 > 0) {
            int finalTotal = num1 / num2;
            if (finalTotal < 1) {
                return "0";
            } else {
                return Integer.toString(finalTotal, 4);
            }
        }
        else{
            return "undefined";
        }
    }

    public String squared(String quaternary){
        int number = Integer.parseInt(quaternary, 4);
        if (number < 0){
            return "0";
        }else {
            String numberSquare = Integer.toString(number * number, 4);
            return numberSquare;
        }

    }

    public String squareRoot(String quaternary){
        int number = Integer.parseInt(quaternary, 4);

        if (number < 0){
            return "0";
        }else {
            String numSqRoot = Integer.toString(((int) Math.sqrt(number)), 4);
            return numSqRoot;
        }

    }
}
