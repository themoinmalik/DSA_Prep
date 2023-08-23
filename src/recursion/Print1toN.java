package src.recursion;

public class Print1toN {

    public static void main(String[] args) {
        int num = 5;
        // int n = 1;
        PrintNum(num);
    }

    public static void PrintNum(int num ) {


        // base condition... 
        if (num == 1) {
            System.out.println(num);
            return;                      
        }
    
        // calling function....  
        PrintNum(num-1);
        System.out.println(num);
       
    }
    
}
