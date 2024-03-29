package Queue;

public class queuearraydidi {
    static class Queue{
        static int size;
        static int arr[];
        static int rear = -1;

        Queue(int n){
            arr = new int[n];   // array size declared
            this.size = n;    // size stored
        }


        public static boolean isEmpty(){
            return rear == -1; 
        }

        //add
        public static void add(int data){
            if(rear == size -1){
                System.out.println("full queue");
                return;
            }
            rear++;  //rear increase 
            arr[rear] = data;    // data stored 
        }

        //dequeue
         public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for(int i =0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--; 
            return front; 
        }

        //peek
        public static int peek(){
        if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
    }
}

public static void main(String[] args) {
    Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
    

