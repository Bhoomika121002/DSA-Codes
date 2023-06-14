package oops5_interfaces;

public class main {
    public static void main(String[] args) {
        Engine car = new car();

        //car.a();
        //which method to run determining on the runtime 
        // car.acc();
        // car.start();  //in case of engine it is also defines because it depends on the which version to access or how to acces 
        // car.stop();   //overridding 

        
        Media carMedia = new car();
        carMedia.stop();


    }
    
}
