package trees;

import java.util.Scanner;

public class binary {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Node root = null;
        root = createtree();
        
    }

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node createtree() {
        System.out.println("Enter the data (or -1 to exit): ");
        int data = sc.nextInt();

        // Check for termination condition
        if (data == -1) {
            return null;
        }

        // Create a new node with the entered data
        Node root = new Node(data);

        System.out.println("Enter left node for " + data + ": ");
        root.left = createtree();

        System.out.println("Enter right node for " + data + ": ");
        root.right = createtree();

        return root;
    }
}