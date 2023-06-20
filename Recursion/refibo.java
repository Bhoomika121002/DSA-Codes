package Recursion;

public class refibo{
    public static void main(String[] args) {
        System.out.println(refibo(4));    
    }
    //function call returning an integer 
static int refibo(int n){
    //base condition
    if(n<2){
        return n;
    } 
    //f(3) called first
    //extra step of addition and returning   
    return refibo(n-1) + refibo(n-2);
    }      
}
