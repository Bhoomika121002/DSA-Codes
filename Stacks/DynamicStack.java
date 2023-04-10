package Stacks;

public class DynamicStack extends customstack{   //never gets full
    public DynamicStack(){       //create constructor
        super();     //it will call customstack
    }
    
    public DynamicStack(int size){       //create constructor
        super(size);     //it will call customstack(int size)
    
    }

    @Override
    public boolean push(int item) {     //override the push method
        // this takes care of being full
        
        if(this.isFull()) {
            //double the array size
            int[] temp = new int[data.length *2];

            //copy all previous items in new data
            for (int i = 0; i< data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }
        //at this point we know that the array is not full
        //insert item normally
        return super.push(item);

    }      

}
