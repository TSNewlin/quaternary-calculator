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
}
