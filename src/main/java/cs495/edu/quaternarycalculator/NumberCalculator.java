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


}
