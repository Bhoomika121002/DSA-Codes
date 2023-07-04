package TrieDS;

public class trie {
    static class Node{
        Node[] children;
        boolean eow;

        //constructor
        public Node() {
            children = new Node[26];   //size 26 a-z
            //initialise
            for(int i = 0; i<26; i++){
                children[i] = null;    //memory not allocated 
            }
            eow = false;
        }
    }  

    static Node root = new Node();    //root node empty  //static variable want to fix the value 

    public static void insert(String word){
        Node curr = root; 
        for (int i =0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                //add new node
                curr.children[idx] = new Node();

            }

            if(i==word.length() -1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];   //next level 
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i = 0; i<key.length(); i++){
            int idx = key.charAt(i) -'a';

            if(curr.children[idx] ==  null){
                return false;
            }
            if(i == key.length() -1 && curr.children[idx].eow == false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"the","a","there","their","any"};
        for(int i = 0; i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an "));
    }
    
}
