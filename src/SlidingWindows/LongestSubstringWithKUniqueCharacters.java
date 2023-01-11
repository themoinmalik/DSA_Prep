package src.SlidingWindows;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueCharacters {

    public static void main(String[] args) {

        String str = "aabacbebebe";
        int k = 3;  // distinct characters
        int ans = checkAns(str, k);
        System.out.println(ans);
    }

    private static int checkAns(String str, int k) {

        int j = 0;
        int i = 0;
        Map<Character, Integer> str_map = new HashMap<>();
        int max = 0;

        while (j < str.length()) {

            // collect all the characters. till
            char c = str.charAt(j);
            str_map.put(c,str_map.getOrDefault(c,0)+1);

            if (str_map.size() < k) {
                j++;
            }
            if (str_map.size() == k) {
                max = Math.max(max, j - i + 1);
                j++;
            }
            if (str_map.size() > k) {
                while (str_map.size() > k) {
                    str_map.put(str.charAt(i),str_map.getOrDefault(str.charAt(i),0)-1);
                    if (str_map.get(str.charAt(i)) == 0) {
                        str_map.remove(str.charAt(i));
                    }
                    i++;
                }
            }
        }

        return max;
    }
}
