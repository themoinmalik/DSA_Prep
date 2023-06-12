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

        

    }

}
