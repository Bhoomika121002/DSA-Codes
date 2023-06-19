import java.util.Scanner;

public class BST {
        public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;
        
        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    } 

    private Node root;

    public BST(){
    }

    public int height(Node node){
        if(node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root ==null;
    }

    //insertion 
    public void insert(int value){
        root = insert(value,root);

    }
    private Node insert(int value , Node node){
        if(node == null){   //if null new node created added otherwise nsame node returned 
            node = new Node(value);
            return node;
        }
        
        if (value < node.value){
            node.left = insert(value, node.left );   //its not chnaging the value 
        }
        if (value > node.value){
            node.right = insert(value, node.right );
        }

        node.height = Math.max(height(node.left), height(node.right)) +1;
        return node;
    }

    public void populate(int[]nums){
        for (int i=0; i<nums.length; i++){
            this.insert(nums[i]);    //insert an array and run insert function multiple times 
        }
    }

    // in case of ssorted arrayss use this populate method 
    public void populatesorted(int[] nums){
        populatesorted(nums,0,nums.length);

    }
    private void populatesorted(int [] nums, int start, int end ){
        if (start>= end){
            return;
        }
        int mid = (start+end)/2;
        this.insert(nums[mid]);
        populatesorted(nums, start, mid);
        populatesorted(nums, mid+1, end);
    }  // this code part ends here 


    public boolean balanced(){
        return balanced(root);

    }
    private boolean balanced(Node node){
        if(node ==null){
            return true;
        }      // check for the subtree as well 
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    } 



    public void display(){
        display(root, "Root Node:");
    }

    private void display(Node node, String details){
        if(node ==null){
            return;
        }
        System.out.println(details+" " +node.value);
        display(node.left, "Left child of " + node.value + ": ");      
        display(node.right, "Right child of " + node.value + ": ");

    }
    public static void main(String[] args) {    
        BST tree = new BST();
        int[] nums = {4,5,6,7,8,9 };
        // tree.populate(nums);
        // tree.display();
        tree.populatesorted(nums);
        tree.display();

    }
}


    

