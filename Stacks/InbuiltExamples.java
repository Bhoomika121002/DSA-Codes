package Stacks;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;

public class InbuiltExamples {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();   // Only integer can be added in stack, created new object in the heap memory which was earlier in the stack memory. 
        // stack.push(34);
        // stack.push(45);
        // stack.push(2);
        // stack.push(9);
        // stack.push(18);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // Queue<Integer> queue = new LinkedList<>();  //linkedlist is implemented by queue
        // queue.add(3);
        // queue.add(6);
        // queue.add(5);
        // queue.add(19);
        // queue.add(1);

        // System.out.println(queue.peek());  //return 3
        // System.out.println(queue.remove());  //remove 3
        // System.out.println(queue.remove());  //remove 6
        // System.out.println(queue.remove());  //remove 5
        // System.out.println(queue.remove());  //remove 19
        // System.out.println(queue.remove());  //remove 1

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();
        



    }
}
