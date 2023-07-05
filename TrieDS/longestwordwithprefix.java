package TrieDS;

public class longestwordwithprefix {
    
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

    //variable define
    public static String ans = "";

    //function   
    public static void longestword(Node root, StringBuilder temp ){
        if(root == null){
            return;
        }
        for(int i = 0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i+'a'));
                if(temp.length() > ans.length()){
                    ans = temp.toString(); //directly value not assignmend to string
                }
                longestword(root.children[i],temp);  //recursive calls
                temp.deleteCharAt(temp.length()-1);   //last index sey delete 
            }

        }
    }

    public static void main(String[] args) {
        String words[] = {"a","banana","app","appl","ap","apply","apple"};
        for(int i =0; i<words.length; i++){
            insert(words[i]);
        }
        longestword(root, new StringBuilder(""));    //empty string
        System.out.println(ans  );
    
}}
