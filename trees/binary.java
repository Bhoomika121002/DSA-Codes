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

    //search
    boolean search(Node root,int x){
        if(root == null){
            return false;   
        }
        if(root.data ==x){
            return true;
        }
        if(root.data > x){
            return search(root.left, x);
        }
        return search(root.right, x);
    }

    //insert recursion
    Node insert(Node root, int key){
        if(root==null){
            return new Node(key);
        }
        if(root.data > x){
            root.left = insert(root.left,key);
        }else if(root.data < x){
            root.right = insert(root.right,key);
        }
    }

    //insert iteratively
    Node insertiteratively(Node root,int key){
        Node newNode = new Node(key);
        Node curr = root;
        Node parent = parent;
    

    while(curr!=null){
        parent = curr;
        if(key < curr.key){
            curr = curr.left;
        }else{
            curr = curr.right;
        }
    }

    if(parent == null){
        parent = newNode;
    }
    else if(key<parent.key){
        parent.left = newNode;
    }else {
        parent.right = newNode;
    }
    return root;
}}