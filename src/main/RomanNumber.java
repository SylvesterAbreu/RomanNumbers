package main;

public class RomanNumber {

    private static final String I = "I";
    private static final String II = I + I;
    private static final String III = II + I;
    private static final String V = "V";
    private static final String IV = I + V;
    private static final String VI = V + I;
    private static final String VII = V + II;
    private static final String VIII = V + III;
    private static final String X = "X";
    private static final String IX = I + X;

    public String getRomanNumberFor(int i) {
        switch (i) {
            case 1:
                return I;
            case 2:
                return II;
            case 3:
                return III;
            case 4:
                return IV;
            case 5:
                return V;
            case 6:
                return VI;
            case 7:
                return VII;
            case 8:
                return VIII;
            case 9:
                return IX;
            default:
                return X;
        }
    }
}
