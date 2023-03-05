import java.util.Arrays;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 16;
        arr[1] = 5;
        arr[2] = 17;
        arr[3] = 190;
        arr[4] = 166;
        // [16,5,17,190,166]  //following are the 2 ways to print 
        System.out.println(arr[4]);

        for(int i= 0; i<arr.length; i++) {
            arr[i] = in.nextInt();     // this is for the input value 
        }

        // array class has tostring method it basically converts it into string and pass that string

        System.out.println(Arrays.toString(arr));

        // for(int i= 0; i<arr.length; i++) {
        //     System.out.print(arr[i]+ " ");   // for again printing the input value
        // }

        // for(int num : arr) {   // for every element in the array. print the element
        //     System.out.print(num + " ");   // here num represents element of the array
        // } 


            //array of objects
            String[] str = new String[5];
            for (int i = 0; i< str.length; i++) {
                str[i] = in.next();
            }

            System.out.println(Arrays.toString(str));

            //modify
            str[1] = "bhoomika";   //reference variable chaged
            System.out.println(Arrays.toString(str));    //changing originL Obj. 



    }

    
    
}
