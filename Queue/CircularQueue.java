package Queue;

public class CircularQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;


public CircularQueue(){
    this(DEFAULT_SIZE); // When nothing is passes we have to use the default size
        
    }
    
    
public CircularQueue(int size) {   //constructor 
    this.data = new int[size];   // new integer array with the size passed

    }

public boolean isFull() {
        return size == data.length -1;    //ptr. is at last index


    }
public boolean isEmpty() {
        return size == -1;    //stack is empty
        

    }
    public boolean insert(int item) {
        if(isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
    
        }
    
        int removed = data[front];
    
        front = front % data.length;
        size--;
        return removed;
    
    }
    public int front() throws Exception{   //displaying the item
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
    
        return data[front];
    
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    
    
    }


}
