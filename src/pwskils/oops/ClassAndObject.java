package src.pwskils.oops;

public class ClassAndObject {


    // 3 types of variables...

    // 1. local
    // 2. instance.
    // 3. static...


    // instance variable inside the class.

    int age  = 20;  // default
    String name = "moin"; // assign default value.


    public static void main(String[] args) {

        // local variable inside the method...  // first need to initialize it
        int a = 10;  // primitive datatype.
        System.out.println(a);

        // print instance variable ... by creating object reference.

        ClassAndObject obj = new ClassAndObject();  // obj is the reference in java. object in c++

        System.out.println(obj.name);

        // try to change instance variable value.
        obj.name = "malik";
        System.out.println(obj.name);  // default value is null.


        // try to change  local variable.

        a = 20;
        System.out.println(a);




    }
}
