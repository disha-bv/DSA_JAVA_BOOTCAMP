package DAY4.Session2;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer>q = new PriorityQueue<>();
        q.offer(20);
        q.offer(30); 
        q.offer(40);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        
    }
    
}
