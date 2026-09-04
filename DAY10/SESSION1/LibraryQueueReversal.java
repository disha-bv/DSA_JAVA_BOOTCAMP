package DAY10.SESSION1;

import java.util.*;

public class LibraryQueueReversal {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Harry Potter");
        queue.add("Lord of the Rings");
        queue.add("Chronicles of Narnia");
        queue.add("Game of Thrones");

        Stack<String> stack = new Stack<>();

    
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println("Reversed Queue: " + queue);
    }
}