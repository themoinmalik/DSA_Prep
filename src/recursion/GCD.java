package src.recursion;

import javax.xml.namespace.QName;

public class GCD {

    public static void main(String[] args) {

        int a = 8;
        int b = 6;
       int ans = getGCD(a,b);
        System.out.println(ans);

    }

    private static int getGCD(int a, int b) {

        int rem = a%b;
        if (rem == 0) {
            return b;
        }else {
            return getGCD(a,rem);
        }
    }

}
