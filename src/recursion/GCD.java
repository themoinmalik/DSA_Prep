package src.recursion;

import javax.xml.namespace.QName;

public class GCD {

    public static void main(String[] args) {

        
        String name  = "";

        int a = 8;
        int b = 6;
       int ans = getGCD(a,b,name);
        System.out.println(ans);


    }

    private static int getGCD(int a, int b, String name) {
        
        if (name == null){
            System.out.println("heheheh null... ");
        }
        else {
            return 0;
        }
        return 1;
    }


}
