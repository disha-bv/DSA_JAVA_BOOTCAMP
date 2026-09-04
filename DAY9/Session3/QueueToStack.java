package DAY9.Session3;
import java.util.*;

public class QueueToStack {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        Queue<Integer> queue = new LinkedList<>();

        for (int value : arr) {
            queue.add(value);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        if (k < 1 || k > queue.size()) {
            System.out.println("Invalid k");
            return;
        }

        
        Stack<Integer> stack = new Stack<>();

        
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        System.out.println("Queue: " + queue);
        System.out.println("Stack: " + stack);
    }
}
