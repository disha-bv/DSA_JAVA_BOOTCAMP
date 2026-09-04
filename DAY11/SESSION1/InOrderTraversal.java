package DAY11.SESSION1;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class InOrderTraversal {

    public List<Integer> InOrder(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root != null) {
            // Left
            result.addAll(InOrder(root.left));

            // Right
            result.addAll(InOrder(root.right));
            
            // Root
            result.add(root.data);
        }

        return result;
    }

    public static void main(String[] args) {

        // Creating the binary tree
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Creating object
        InOrderTraversal obj = new InOrderTraversal();

        // Calling preOrder method
        List<Integer> result = obj.InOrder(root);

        // Printing result
        System.out.println("In-order traversal:");
        System.out.println(result);
    }
}

