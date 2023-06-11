package src.pwskils.patterns;

public class Pattern {

    public static void main(String[] args) {

        // triangle..

//        for (int i = 0;i<=5;i++) {
//            for (int j = 0;j<=i;j++) {
//                System.out.print(" * " );
//            }
//            System.out.println("");
//        }

        // reverse ...

        int n = 5;

//        for (int i = 0;i<n;i++) {
//            for (int j = i;j<n;j++) {
//                System.out.print(" * ");
//            }
//            System.out.println("");
//        }

        // stairs...

//        for (int i=0;i<n;i++){
//            for (int j=i;j<n-1;j++) {
//                System.out.print("*");
//            }
//            System.out.println("&");
//        }

        //   square...

//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <=n; j++) {
//                if (i == 0 || j == 0 || i == n || j == n) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }

        // diagonal...

//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <=n; j++) {
//                if (i == j) {
//                    System.out.print(" * ");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }

        // cross.

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=n; j++) {
                if (i == j || i+j == n ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }


    }

}


