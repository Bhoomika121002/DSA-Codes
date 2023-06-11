package oops3;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);  //values from parent --call the parent class constructor 
        // used to initialize values in the parent class 
        this.weight = weight;
    }

    

    
}
