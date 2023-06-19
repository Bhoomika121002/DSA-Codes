import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Binarytrees{
    public Binarytrees(){

    }
    public static class Node{
        private int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
        
    }

    private Node root; 

    //insert elements - populate the function 
    public void populate(Scanner scanner){
        System.out.println("Enter value of Root Node ");
        int value = scanner.nextInt();
        root =new Node(value);   //here the value at root added and now populate a new recussion function foor adding values of the other nodes 
        populate(scanner,root);

    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of" + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("enter value left of" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);

        }
        System.out.println("Do you want to enter right of" + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("enter value enter right of" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);


    }
        
    }
    //displwy function
    public void display(){
        display(root, "");

    }
    private void display(Node node, String indent){
        if (node == null){
            return; 
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent  + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Binarytrees tree = new Binarytrees();
        tree.populate(scanner);
        tree.display();
        tree.prettydisplay();
    }



    // on rotating the tree 
    public void prettydisplay(){
        prettydisplay(root,0);

    }
    private void prettydisplay(Node node, int level){
        if(node == null){return;} 

        //call the rightmost value 
        prettydisplay(node.right, level+1);

        if(level != 0) {    //not in root
            for( int i =0; i< level-1; i++){
                System.out.println("\t\t");   //2 spaces
            }
            System.out.println("---------->" + node.value);
        }else{
        System.out.println(node.value);}
     prettydisplay(node.left, level +1);    
    }

    //traversals 
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value+ " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        preorder(root);
    }
    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        
        preorder(node.left);
        System.out.print(node.value+ " ");
        preorder(node.right);
    }
    public void postorder(){
        preorder(root);
    }
    private void postorder(Node node) {
        if (node == null) {
            return;
        }
        
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.value+ " ");
    }
    
    
}
