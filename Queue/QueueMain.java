package Queue;

public class QueueMain {
    public static void main(String[] args) {
        //CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(6);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        // System.out.println(queue.remove());    // first item will be removed
        // queue.insert(133);
        // queue.display();

    }
}
