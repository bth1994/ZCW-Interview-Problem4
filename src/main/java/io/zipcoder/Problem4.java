package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {

    public static String canBePalindrome(String input) {
        String[] split = input.split("");
        Map<String, Integer> occurrences = new HashMap<>();

        for (String s : split) {
            if (occurrences.get(s) == null) {
                occurrences.put(s, 1);
            } else {
                occurrences.put(s, occurrences.get(s) + 1);
            }
        }

        Integer oddCount = 0;
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount > 1) {
            return "NO";
        }
        return "YES";
    }
}

