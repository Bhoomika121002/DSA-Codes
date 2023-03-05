import java.util.Scanner;
public class methods {
    public static void main(String[] args){
        // int ans = sum2();      // function call can be run any number of times   // it is storing the value in ans  
        // System.out.println(ans);   // print thr value stores in the answer
    
        int ans = sum3(20,30);      // function call can be run any number of times   // it is storing the value in ans  
        System.out.println(ans);    
    }

        static int sum3(int a, int b){
            int sum = a+b;
            return sum;
        }

    // return the value
    static int sum2() {      //int is the return type that displays the value
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = in.nextInt();
        int sum = num1+ num2;
        return sum;     // if we write anything after this will not be printed
    }
    static void sum() {     // funtions for the sum program void id return type 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = in.nextInt();
        int sum = num1+ num2;
        System.out.println("Enter the sum as " + sum);
}

}
 