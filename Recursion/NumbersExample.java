package Recursion;

public class NumbersExample {

    //write a function that takes in a number and prints it
    //print first 5 numbers 1234

    public static void main(String[] args) {
        //print1(1);
        // print1(2);
        // print1(3);
        // print1(4);
        print(1);
    }
    // static void print1(int n){
    //     System.out.println(n);
    //     print2(2);
    // }
    // static void print2(int n){
    //     System.out.println(n);
    //     print3(3);
    // }
    // static void print3(int n){
    //     System.out.println(n);
    //     print4(4);
    // }
    // static void print4(int n){
    //     System.out.println(n);
    // }
    static void print(int n) {
        if(n==4){    //at 4 not call anyting simply returrn // check function  
            System.out.println(4);
            return;
        }
        System.out.println(n);

        //recursive call
       //teail recursion lat staemnet  
        //if you are calling function again and again you trear it as a seperate call in the stack
        print(n+1);   //function call itself //earlier it is calling n+1 parameter 

    }
    
    
}
