package cs495.edu.quaternarycalculator;

public class QuaternaryConverter {
    public static int toDecimal(String quaternaryString)  {
        int decimalValue = 0;
        for (int i = 0; i < quaternaryString.length(); i++) {
            int quaternaryNumber = Character.getNumericValue(quaternaryString.charAt(i));
            decimalValue += quaternaryNumber * (int) (Math.pow(4, quaternaryString.length() - i - 1));
        }
        return decimalValue;
    }

    public static String toQuaternary(int baseTenNumber) {
        StringBuilder quaternary = new StringBuilder();
        while (baseTenNumber != 0) {
            int remainder = baseTenNumber % 4;
            baseTenNumber = baseTenNumber / 4;
            quaternary.insert(0, remainder);
        }
        return quaternary.toString();
    }
}
