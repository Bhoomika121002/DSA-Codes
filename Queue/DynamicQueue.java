package Queue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){       //create constructor
        super();     //it will call customstack
    }
    
    public DynamicQueue(int size){       //create constructor
        super(size);     //it will call customstack(int size)
    
    }

    @Override
    public boolean insert(int item){
    if(this.isFull()) {
        //double the array size
        int[] temp = new int[data.length *2];

        //copy all previous items in new data
        for (int i = 0; i< data.length; i++){
            temp[i] = data[front+i] % data.length;
        }

        front = 0;
        end = data.length;
        data = temp;
    }
    //at this point we know that the array is not full
    //insert item normally
    return super.insert(item);
    }
}
