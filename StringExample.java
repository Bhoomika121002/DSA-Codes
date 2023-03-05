import java.util.Scanner;
// this is the example in the funtions and method explanation 
public class StringExample {
    public static void main(String[] args){
        // String message = greet();
        // System.out.println(message);
        
        // for taking the scanner for the nam e
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);

        //String personalised = myGreet( "bhoomika");     // this is used ehen name is input in the code
         //System.out.println(personalised);
        

    }
    static String myGreet(String name) {
        String message = "hello " + name;
        return message;
        

    }
    static String greet() {
        String greeting = "how are you";
        return greeting; 
        
    }
}
