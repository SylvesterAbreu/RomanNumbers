package main;

import java.util.HashMap;

public class RomanNumber {

    static {
        romanNumberHashMap = new HashMap<Integer, String>();
        initializeRomanNumberHashMap();
    }

    private static final HashMap<Integer, String> romanNumberHashMap;

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

    private static void initializeRomanNumberHashMap() {
        romanNumberHashMap.put(new Integer(1), I);
        romanNumberHashMap.put(new Integer(2), II);
        romanNumberHashMap.put(new Integer(3), III);
        romanNumberHashMap.put(new Integer(4), IV);
        romanNumberHashMap.put(new Integer(5), V);
        romanNumberHashMap.put(new Integer(6), VI);
        romanNumberHashMap.put(new Integer(7), VII);
        romanNumberHashMap.put(new Integer(8), VIII);
        romanNumberHashMap.put(new Integer(9), IX);
        romanNumberHashMap.put(new Integer(10), X);
    }

    public String getRomanNumberFor(int i) {
        final Integer input = new Integer(i);
        final boolean hasInput = romanNumberHashMap.containsKey(input);
        return hasInput ? romanNumberHashMap.get(input) : "XI";
    }
}
