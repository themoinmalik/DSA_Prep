package src.maths;

public class Reverse {

    public static void main(String[] args) {
        int num = 254564;
        int rev = ReverseNum(num);
        System.out.println(rev);
    }

    private static int ReverseNum(int num) {

        int rev = 0;

        while (num!=0) {
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        return rev;
    }


}
