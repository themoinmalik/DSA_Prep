package src.string;


import java.util.HashSet;
import java.util.Set;

public class uniqueString {
    public static void main(String[] args) {
        String str = "moinmalik";
        boolean ans = isUniqueChar(str);
        System.out.println(ans);
    }

    private static boolean isUniqueChar(String str) {

        Set<Character> set = new HashSet<>();

        for (int i=0;i<str.length();i++) {
            set.add(str.charAt(i));
        }

        return set.size() == str.length();
    }
}
