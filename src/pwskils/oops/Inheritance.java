package src.pwskils.oops;


class Parent {
    public void m1(){
        System.out.println("Hello from parent class m1");
    }

    public void m2(){
        System.out.println("Hello from parent class m2");
    }
}


class Child extends Parent {

    public void m1(){
        System.out.println("hello from child m1");
    }

    
}

class Inheritance {


   public static void main(String[] args) {
    
    Child c = new Child();
    c.m1();
    c.m2();

    Parent p = new Parent();

    p.m1();
    
   }

    
}
