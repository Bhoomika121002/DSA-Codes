package OOPS3poly;

public class Circle extends Shapes {
    
    //this will run when obj of circle is created
    //hence it is overidding the parent method
    @Override   // --annotation
    void area() {
        System.out.println("Area is pie * r* r ");
    }
}
 