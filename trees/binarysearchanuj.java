package trees;

import java.util.Scanner;

public class binarysearchanuj {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = createtree();
        
    }

    class Node{
        Node left, Right;
        int data;

        public Node(int data){
        this.data=data;}
    }

    static Node createtree(){
        Node root = null; 
        System.out.println("Enter the data:");
        int data = sc.nextInt(); 
        if(data == -1){
            return null;

        }
        root = new Node(data);
        System.out.println("Enter left node:" + data);
        root.left = createtree();

        System.out.println("Enter right node:" + data);
        root.Right = createtree();

    }
    
}
