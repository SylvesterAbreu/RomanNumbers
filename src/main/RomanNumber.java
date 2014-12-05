package main;

public class RomanNumber {

    public static final String I = "I";
    public static final String II = I + I;
    public static final String III = II + I;
    public static final String V = "V";
    public static final String IV = I + V;
    public static final String VI = V + I;

    public String getRomanNumberFor(int i){
        switch (i){
            case 1: return I;
            case 2: return II;
            case 3: return III;
            case 4: return IV;
            case 5: return V;
            default:return VI;
        }
    }
}
