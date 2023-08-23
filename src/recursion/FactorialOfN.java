package src.recursion;

public class FactorialOfN {
    

    public static void main(String[] args) {
        int n = 13;
        int ans = factorial(n);
        System.out.println(ans);
    }


    public static int factorial(int n) {

        //
        if (n == 1) {
            return n;
        }
        
        return n*factorial(n-1);        
                
    }
    
    
}


