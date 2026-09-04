package DAY11.SESSION3;

class TrieNode{
    TrieNode [] children;
    boolean isEnd;

    public TrieNode(){
        children = new TrieNode[26];
        isEnd = false;
    }
}

public class TrieDataStructure {
    TrieNode root = new TrieNode();
    
    //Insert a word
    public void insert (String word){
        TrieNode current = root;
        for( char ch : word.toCharArray()){
            int index = ch - 'a';
            if(current.children[index]==null){
                current.children[index] = new TrieNode();
            }
            current= current.children[index];
        }
        current.isEnd= true;
    }

    //search word
    public boolean search(String word){
        TrieNode current = root;
        for( char ch : word.toCharArray()){
            int index = ch - 'a';
            if(current.children[index]==null){
                return false;
            }
            current= current.children[index];
        }
        return current.isEnd;
    }
    public static void main(String[] args){
        TrieDataStructure t = new TrieDataStructure();
        t.insert("apple");
        t.insert("chandana");
        t.insert("thomas");

        //Operations
        System.out.println(t.search("apple"));
    }
}