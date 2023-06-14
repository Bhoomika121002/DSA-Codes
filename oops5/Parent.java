package oops5;


//eg parents say choose your career and partner own its own 
public abstract class Parent {

    int age;
    
    static void hello(){
        System.out.println("hey");
    }

    void normal(){
        System.out.println("normalmethods ");
    }

    abstract void career();
    abstract void partner();
}
 