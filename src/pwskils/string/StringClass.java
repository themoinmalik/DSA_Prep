package src.pwskils.string;

public class StringClass {

    public static void main(String[] args) {

        
        // Two types of string immutable and mutable strings;

        String str = "mutable";   // mutable string

        System.out.println(str);

        str.concat("mutable with editable string");

        System.out.println(str);


        // immutable string

        StringBuilder str1 = new StringBuilder();

        str1.append("immutable");

        System.out.println(str1);


        str1.append("immutable with editable");

        System.out.println(str1);

        // a little more.

        String s1 = "moin"; // store in string constant pool. duploicatyes not allowed.
        String s2 = "moin"; // s2 refer to the same string constant pool; // no new object created.

        // when we use new keyword , data store in Heap memory. // diuplcates allowed.

        String sh1 = new String("moin");
        String sh2 = new String("moin"); // duplcates allowed. refere to the the memory;

        // let see.
        
        // compare /

        System.out.println(s1 == sh1);

    }

}
