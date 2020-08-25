package easy;

import java.util.HashMap;
import java.util.Map;

class RomanNumber {

    public static void main(String[] args) {
        System.out.println(romanToInt("IXII"));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int len = s.length();

        int total = romanMap.get(s.charAt(len - 1));
        for (int i = 0; i < len - 1; i++) {

            Integer valueFirst = romanMap.get(s.charAt(i));
            Integer valueSecond = romanMap.get(s.charAt(i + 1));


            if (valueFirst < valueSecond)
                total -= valueFirst;
            else {
                total += valueFirst;
            }

        }
            return total;


    }
}