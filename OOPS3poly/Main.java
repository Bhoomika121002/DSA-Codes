package OOPS3poly;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square(); //it will have access to the obj not the reefernce variable  
        //Shapes square = new Square(); // it will call square only 
        //shape.area();
        circle.area();
    }
    
}
