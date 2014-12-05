package main;

public class RomanNumber {
    public String getRomanNumberFor(int i){
        switch (i){
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            default:return "IV";
        }
    }
}
