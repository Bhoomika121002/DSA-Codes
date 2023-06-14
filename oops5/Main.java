package oops5;

public class Main {
    public static void main(String[] args) {
        
        
        Son son = new Son(28);
        son.career();

        Daughter daughter = new Daughter(34);
        daughter.career();
          
        
        Parent.hello();
        son.normal();  
        
    }
    
}
