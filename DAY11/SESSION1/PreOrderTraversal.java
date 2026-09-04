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

public class PreOrderTraversal {

    public List<Integer> preOrder(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root != null) {
            // Root
            result.add(root.data);

            // Left
            result.addAll(preOrder(root.left));

            // Right
            result.addAll(preOrder(root.right));
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
        PreOrderTraversal obj = new PreOrderTraversal();

        // Calling preOrder method
        List<Integer> result = obj.preOrder(root);

        // Printing result
        System.out.println("Pre-order traversal:");
        System.out.println(result);
    }
}

