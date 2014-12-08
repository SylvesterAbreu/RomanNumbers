package main;

import java.util.HashMap;

public class RomanNumber {

    private static final HashMap<Integer, String> romanNumberHashMap = new HashMap<>();

    static {
        initializeRomanNumberHashMap();
    }

    private static void initializeRomanNumberHashMap() {
        romanNumberHashMap.put(Integer.valueOf(1), "I");
        romanNumberHashMap.put(Integer.valueOf(2), "II");
        romanNumberHashMap.put(Integer.valueOf(3), "III");
        romanNumberHashMap.put(Integer.valueOf(4), "IV");
        romanNumberHashMap.put(Integer.valueOf(5), "V");
        romanNumberHashMap.put(Integer.valueOf(6), "VI");
        romanNumberHashMap.put(Integer.valueOf(7), "VII");
        romanNumberHashMap.put(Integer.valueOf(8), "VIII");
        romanNumberHashMap.put(Integer.valueOf(9), "IX");
        romanNumberHashMap.put(Integer.valueOf(10), "X");
    }

    public String getRomanNumberFor(int i) {
        final Integer input = Integer.valueOf(i);
        final boolean hasInput = romanNumberHashMap.containsKey(input);

        return hasInput ? romanNumberHashMap.get(input) : "XI";
    }
}