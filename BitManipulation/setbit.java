package BitManipulation;

import java.util.Scanner;

public class setbit {
    public static void main(String[] args) {
        int n = 5;
        //int pos = 2;  //for get clear
        int pos = 1;  //for set  update 
        //int bitmask = 1<<pos;
        //int notbitmask = ~(bitmask);
        
        Scanner sc = new Scanner(System.in);
        int oper =  sc.nextInt();
        //int oper = 1; -> set
        //u\oper -> 0 -> clear    //update bit to 1 else update bit to 0

        //get bit 
        // if((bitmask & n) ==0){
        //     System.out.println("bit was 0");
        // }else{
        //     System.out.println("bit was one");
        // }
 
        //set bit 
        // int newnumber = bitmask | n;
        // System.out.println(newnumber);

        //clear bit
        // int newnumber = notbitmask & n;
        // System.out.println(newnumber);

        //update bit
        int bitmask = 1<<pos;
        if (oper ==1){
            int newnumber = bitmask | n;
            System.out.println(newnumber);
        } else{
            int notbitmask = ~(bitmask);
            int newnumber = notbitmask & n;
            System.out.println(newnumber);

        }
        
    }
    
}
