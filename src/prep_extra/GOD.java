package src.prep_extra;


class Parents {

    public void weekend() {
        System.out.println("Learn JAva");
    }

    
}

class Children extends Parents{
    public void weekend() {
        System.out.println("LEarn java and springboot");
    }
}

public class GOD {

    // Children child = new Children();
    
    public static void main(String[] args) {
        
        // Children child = new Children();
        Parents child = new Children();
        child.weekend();
        
    }
    
}
