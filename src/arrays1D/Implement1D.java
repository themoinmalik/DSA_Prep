package src.arrays1D;

import java.util.Arrays;

public class Implement1D {

    public static void main(String[] args) {

        int[] arr = new int[5]; // define array of size 5 .

        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 9;
        arr[4] = 3;


        System.out.println(arr[arr.length -1]);

    }


    // object of Array.
    public class Student {
        String name;
        int roll;

        public Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }


        // define values for diff students...
        Student st1 = new Student("moin", 99);
        Student st2 = new Student("malik", 98);

    }

}
