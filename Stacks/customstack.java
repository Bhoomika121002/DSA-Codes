package Stacks;

public class customstack {
    protected int[] data; //generics genereic linked lis
    private static final int DEFAULT_SIZE = 10;  //size is same for all the obj of custom stack //private - not want people to change directly // final- not change ever
    

    int ptr = -1;

    public customstack(){
        this(DEFAULT_SIZE); // When nothing is passes we have to use the default size
        
    }
    
    
    public customstack(int size) {   //constructor 
        this.data = new int[size];   // new integer array with the size passed

    }

    public boolean push(int item) {       // insert an item in this
        if (isFull()) {                 // if the array is full return out of bound method
            System.out.println("Stsck is full");
            return false;
        }
        
        ptr++;
        data[ptr] = item;
        return true;

    }

    public int pop() throws StackException{
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack");
            
        } 
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackException{                     // show the top value not removes the value
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }



    public boolean isFull() {
        return ptr == data.length -1;    //ptr. is at last index


    }
    public boolean isEmpty() {
        return ptr == -1;    //stack is empty
        

    }


}
