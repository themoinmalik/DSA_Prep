package src.string;

import java.util.Arrays;

public class ReverseOfString {

    public static String[] solution(String[] str){

        // using two pointer.
        int left = 0;
        int right = str.length -1;

        while (left < right) {
            // swap..
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }

        return  str;

    }

    public static void main(String[] args) {

        String[] str = {"h","e","l","l","o"};
        String[] ans = solution(str);
        System.out.println(Arrays.toString(ans));

    }
}
