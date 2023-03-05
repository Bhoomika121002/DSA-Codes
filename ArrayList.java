import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        //syntax
        ArrayList<Integer> list = new ArrayList<>(); // this value 10 not matters as many numbers added it will be visible. 


    // list.add(45);
    // list.add(467);
    // list.add(48);

 
    // // System.out.println(list.contains(665));
    // System.out.println(list);

    // list.remove(2);
    
    // list.set(0,99);   // 0 will be changed to 99

    
    // System.out.println(list);

    //input
    for(i = 0; i<5; i++);
    {
        list.add(in.nextInt());
    }

    //get item at any index
    for(i = 0; i<5; i++);
    {
        System.out.println(list.get(i));   // pass index here list[index] syntax will not work here 
    }

    System.out.println(list);

    }
}
