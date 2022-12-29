package src.maths;

public class Palindrom {
    public static void main(String[] args) {
        
        int num = 121;
        int reverse = ReverseNum(num);
        System.out.println(reverse == num);
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
