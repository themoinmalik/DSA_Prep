package src.string;

import java.util.Arrays;

public class ParmutationOfString {
    public static void main(String[] args) {
        String s1 = "moin";
        String s2 = "nomi";

        boolean ans = isPalindrom(s1,s2);
        System.out.println(ans);
    }

    private static boolean isPalindrom(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        return sort(s1).equals(sort(s2));
    }

    private static String sort(String str) {

        char[] strArr = str.toCharArray();

        Arrays.sort(strArr);

        return new String(strArr);

    }

}
