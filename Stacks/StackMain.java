package Stacks;

public class StackMain {   //building main class from which other classes work
    public static void main(String[] args) throws StackException{
        // stack = new customstack(5);  // this command will not add more value 
        DynamicStack stack = new DynamicStack(5); // it will insert the value 
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(18);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());   //because it throws exception so we have to put it in methodd eclaration process as well
        System.out.println(stack.pop());   //this command will show ecception\


    }
    
    
}
