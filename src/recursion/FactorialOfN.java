package src.recursion;

public class FactorialOfN {


    public static int getFact(int n) {


        if (n  == 1) {
            return 1;
        }else {
            return n * getFact(n-1);
        }
    }


    public static void main(String[] args) {

        int n = 7;

        int ans = getFact(7);
        System.out.println(ans);

    }


}
