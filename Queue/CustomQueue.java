package Queue;

public class CustomQueue {
    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    int end = 0;

public CustomQueue(){
    this(DEFAULT_SIZE); // When nothing is passes we have to use the default size
        
    }
    
    
public CustomQueue(int size) {   //constructor 
    this.data = new int[size];   // new integer array with the size passed

    }

public boolean isFull() {
        return end == data.length -1;    //ptr. is at last index


    }
public boolean isEmpty() {
        return end == -1;    //stack is empty
        

    }
public boolean insert(int item) {
    if(isFull()) {
        return false;
    }
    data[end++] = item;
    return true;
}

public int remove() throws Exception {
    if (isEmpty()) {
        throw new Exception("Queue is empty");

    }

    int removed = data[0];

    // shifting the element to left
    for(int i = 1; i<end; i++) {
        data[i-1] = data[i];
    }
    end--;    // in the end end will also be removed 
    return removed;

}
public int front() throws Exception{   //displaying the item
    if (isEmpty()) {
        throw new Exception("Queue is empty");
    }

    return data[0];

}

public void display(){
    for (int i =0; i < end; i++) {
        System.out.print(data[i] + " <- ");


    }
    System.out.println("END");


}



    
}
