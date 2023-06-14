package oops5_interfaces;

public class car implements Engine, Brake, Media {

    int a = 30;

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("i accelerate  like a normal car");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("I start engine like a normal can ");
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("i stop engine like a normal car ");
    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println( "i brake like a normal car" );
        
    }
    

    
}
