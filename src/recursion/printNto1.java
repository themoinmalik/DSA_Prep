package src.recursion;

public class printNto1 {

    public static void main(String[] args) {

        int n = 7;
        printNto1Num(n);


    }

    private static void printNto1Num(int n) {

        if (n == 1){
            System.out.print(1);
            return;
        }else {
            System.out.print(n);
            printNto1Num(n-1);
        }

    }


}
