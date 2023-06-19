package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        //int c = a/b;  //arithmatic exception runtime
    
        try {
            //divide(a,b);   //gave error 
             //int c = a/b;
            String name = "Bhoomika";
            if(name.equals("Bhoomika")){
                throw new Exception("name is Bhoomika");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());   //results the message /by zero 
        }  catch (Exception e){
            System.out.println(e.getMessage());   //results the message /by zero 
        } finally{
            System.out.println("this will execute");
        }
    
    } 

    static int divide(int a, int b) throws ArithmeticException{
       if(b==0){
        throw new ArithmeticException("exception");      
    }
        
       
        return a/b;

    }
    
}
