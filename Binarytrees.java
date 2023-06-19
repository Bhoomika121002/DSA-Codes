import java.util.Scanner;

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
            System.out.println("Do you want to enter left of" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);

        }
        System.out.println("Do you want to enter right of" + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Do you want to enter right of" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.right);


    }
        
    }
    //displwy function
    public void display(){
        display(root, "");

    }
    private void display(Node node, String indent){
        if (node!= null){
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
    }

}
