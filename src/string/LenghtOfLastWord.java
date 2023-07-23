package src.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LenghtOfLastWord {

    public  static  int solution(String str) {

        str = str.trim();
        
        int lenf = (str.length() - str.lastIndexOf(" "))-1;

        return lenf;
    }


    public static void main(String[] args) {

        String str = " the moin malik ";

        int length = solution(str);
        System.out.println(length);
    }
}
