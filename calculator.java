import java.io.*;
import java.util.*;



import java.util.Scanner;

public class calculator {
        public static void main(String[] args) 
        {
            Scanner in = new Scanner(System.in);   
            // take input from user untill user press X & x
        int ans = 0;
            while(true)  {  //infinite loop run
            // take the operator as input

            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input 2 numbers
                int num1 = in.nextInt();
                int num2 = in.nextInt();
            
            if (op== '+'){
                ans = num1+num2;}
            
            if (op== '-'){
                ans = num1-num2;}

            if (op== '*'){
                ans = num1*num2;}

            if (op== '/'){
                if (num2!= 0){
                ans = num1/num2;}}

            if (op== '%'){
                ans = num1%num2;}
            
            } 
            else if (op == 'x' || op == 'X' ){
            break;
        }

            else {
                System.out.println("invalid operation!!");
            }   
            
        
        System.out.println(ans);
}
}
}




