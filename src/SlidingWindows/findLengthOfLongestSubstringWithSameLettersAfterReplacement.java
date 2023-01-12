package src.SlidingWindows;

import java.util.HashMap;
import java.util.Map;

public class findLengthOfLongestSubstringWithSameLettersAfterReplacement {

    public static void main(String[] args) {

        String str = "moinmalikhh";
        int k = 2;

        int ans = checkLongestSubString(str, k);
        System.out.println(ans);
    }

    private static int checkLongestSubString(String str, int k) {

        Map<Character, Integer> map = new HashMap<>();
        int j = 0;
        int i = 0;
        int n = str.length();
        int maxLen = Integer.MIN_VALUE;

        for (j = 0; j < n; j++) {
            char c = str.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);

            int maxRepeatLetter = maxRapeatLetter(map);

            if (j - i + 1 - maxRepeatLetter > k) {
                while (j - i + 1 - maxRepeatLetter > k) {
                    char leftChar = str.charAt(i);
                    map.put(leftChar, map.get(leftChar) - 1);
                    i++;
                }
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }

    private static int maxRapeatLetter(Map<Character, Integer> map) {

        int maxCount = 0;
        for (int count : map.values()) {
            if (maxCount < count) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
