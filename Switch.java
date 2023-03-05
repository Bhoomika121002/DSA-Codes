import java.util.Scanner;

public class Switch {

    public static void main(String[] args)  {
       Scanner in = new Scanner(System.in); 
         // String fruit = in.next(); 
        
        // 
        //    switch(fruit) {
        //     case "Mango":
        //         System.out.println("King of Fruits");
        //     break;
        //     case "Apple":
        //         System.out.println("red fruit");
        //     break;
        //     default:
        //         System.out.println("please enter valid fruit");
    


        // switch (fruit) {
        //         case "Mango" -> System.out.println("King of Fruits");
        //         case "Apple" -> System.out.println("red fruit");
        //         default -> System.out.println("please enter valid fruit");
    

        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            
        }
    }
        
}       
        
        
        
        
        
        
        
        
        
        
        
        
        
        //if(fruit.equals("Mango")){
         //   System.out.println("a sweet fruit");
        //}
    



    


