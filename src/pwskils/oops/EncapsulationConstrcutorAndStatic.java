package src.pwskils.oops;

public class EncapsulationConstrcutorAndStatic {


    // excapsuation. 
    
    int i = 10;

    int helloWorld(int x){
        this.i = x +1;         // define context, or scope
        return i;

    }

    // static block execute first. 

    static {
        System.out.println("Hello from static block.");
    }


    static void staticMethdod() {
        System.out.println("Hello i am static methdod.");
    }

    public static void main(String[] args) {
        
        EncapsulationConstrcutorAndStatic env = new EncapsulationConstrcutorAndStatic();   
        // there is always default constrcitor.   
        // which is automatically created when we crate object of that class. 

        System.out.println(env.i);   // i = 10 . 

        System.out.println(env.helloWorld(0));

        System.out.println(env.i);   // i = 1.. value updated.

        EncapsulationConstrcutorAndStatic.staticMethdod(); // no need to create object to call static methods. 

        System.out.print("" == "");



    }
    
}
