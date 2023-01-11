package src.SlidingWindows;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String str = "moinmalikhellokhan";  // variable type..

        int ans = checkUniqueSubString(str);
        System.out.println(ans);
    }

    private static int checkUniqueSubString(String str) {

        Map<Character,Integer> map = new HashMap<>();
        int n = str.length();
        int j= 0;
        int i = 0;
        int max = Integer.MIN_VALUE;

        while (j<n) {

            char c = str.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);

            if (map.size() < j-i+1) {
                // shrink remove all the duplicate characters from slide.
                while ( map.size() < j-i+1) {
                    char leftCh = str.charAt(i);
                    // remove characters.
                    map.put(leftCh,map.getOrDefault(c,0)-1);
                    if (map.get(leftCh) == 0) {
                        map.remove(leftCh);
                    }
                    i++;
                }
            }
            if (map.size() == j-i+1) {
                max = Math.max(max,j-i+1);
                j++;
            }
        }
        return max;
    }
}
