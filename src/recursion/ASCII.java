package src.recursion;

public class ASCII {

    public static void main(String[] args) {

        String s1 = "eat";
        String s2 = "sea";

       int n = s1.charAt(0);

       for (int i = 0; i < s1.length(); i++) {

           int n1 = s1.charAt(i);
           int n2 = s2.charAt(i);

           System.out.println(n1);
           System.out.println(n2);
        
       }
        
        
        
    }
    
}
