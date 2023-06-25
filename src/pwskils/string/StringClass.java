package src.pwskils.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringClass {

    public static String solution(String s) {

        s = s.trim();

        List<String> list = Arrays.asList(s.split("\\s+"));

        Collections.reverse(list);

        return String.join(" ", list);

    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moonlight  ";
        String ans = solution(s);
        System.out.println(ans);
    }

}
