import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);   //nth value
        int n = in.nextInt();

        int a = 0; 
        int b = 1;   // a& b are fixed
        int count = 2;

        while (count <= n){
            int temp = b;   //temp new variable
            b=b+a;
            a = temp; 
            count++;
        }
        System.out.println(b);

        }




    }

