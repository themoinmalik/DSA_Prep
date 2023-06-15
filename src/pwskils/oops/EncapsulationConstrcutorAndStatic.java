package src.pwskils.oops;

public class EncapsulationConstrcutorAndStatic {
    
    int i = 10;

    int helloWorld(int x){
        this.i = x +1;
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

        System.out.println(env.i);   // i = 10 . 

        System.out.println(env.helloWorld(0));

        System.out.println(env.i);   // i = 1.. value updated.

        env.staticMethdod();


    }
    
}
