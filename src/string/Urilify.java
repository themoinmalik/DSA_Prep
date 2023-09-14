package src.string;

public class Urilify {

    public static void main(String[] args) {
        String str = "moin malik   ";
        int trueLen = 10;
        String ans = replaceStringWithPer20(str,trueLen);
        System.out.println(ans);
    }

    private static String replaceStringWithPer20(String str, int trueLen) {

        int spaceCount = 0;
        // number of spaces
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int index = trueLen + spaceCount * 2;

        for (int i = 0; i < index; i++) {

            if (str.charAt(i) == ' ') {

            }
        }

        return str;
    }


}
