package Questions;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        System.out.println("Hello HEAP");

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < 10; i++) {
            int val = (int)(Math.random()*100);
            heap.add(val);
        }
        int n = heap.size();
        for (int i = 0; i < n; i++) {
            System.out.println(heap.poll());
        }
    }
}
