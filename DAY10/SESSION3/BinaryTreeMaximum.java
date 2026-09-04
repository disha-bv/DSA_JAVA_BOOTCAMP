package DAY10.SESSION3;
// Find the maximum element in Binary Tree
import java.util.Scanner;
class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree2{
    Node root;
    public BinaryTree2(){
        root = null;
    }

    Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            root.left = insert(root.left, data);
        }
        if(data > root.data){
            root.right = insert(root.right, data);
        }
        return root;
    }

    void inserthere(int data){
        root = insert(root, data);
    }

    int getMax(){
        return findMax(root);
    }

    // DFS
    int findMax(Node root){
        if (root == null) {
            return 0;
        }
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
}

public class BinaryTreeMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        BinaryTree2 tree = new BinaryTree2();
        System.out.println("Enter the number of values:");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("enter the value:");
            int value = sc.nextInt();
            tree.inserthere(value);
        }
        System.out.println("Maximum value: " + tree.getMax());
        sc.close();          
    }
}