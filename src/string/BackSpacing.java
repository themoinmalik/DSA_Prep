package src.string;

public class BackSpacing {

    public static void main(String[] args) {
        String s = "kh#kjlhkljh";
        String t = "kjhkhj##lkj#";

        boolean ans = backspaceCompare(s,t);
        System.out.println(ans);
    }
    public static boolean backspaceCompare(String s, String t) {
        return isStringEqual(s).equals(isStringEqual(t));
    }

    public static String isStringEqual(String str) {   //string with #include...
        StringBuilder actualString = new StringBuilder();  // actual string
        int hashCount = 0;
        for (int i = str.length()-1;i>=0;i--) {

            if (str.charAt(i) == '#') {
                hashCount++;
                continue;
            }

            if (hashCount>0) {
                hashCount--;
            } else {
                actualString.insert(0,str.charAt(i));
            }
        }

        return actualString.toString();

    }
}
