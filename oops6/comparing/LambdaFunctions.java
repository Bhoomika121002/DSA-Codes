package oops6.comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arr.add(i+1);
        }


        //everysingle item one by one 
        arr.forEach((item) -> {
            System.out.println(item * 2);
        } );

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);





        // new calculator implementation 
        Operation sum = (a,b) -> a+b;    //can perform many operation 
        Operation prod = (a,b) -> a*b;
        

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(4,3,sum));
        System.out.println(myCalculator.operate(5,3,prod));

   
    }


    private int operate (int a, int b , Operation op){
        return op.operation(a,b);
    }

    // int sum(int a, int b) {
    //     return a+b;
    // }
    
}

interface Operation{    //abstract method // at runtime it decide which to execute 
    int operation(int a, int b);
}


