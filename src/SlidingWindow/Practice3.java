package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collector;

public class Practice3 {
    static int[] maxOfAllSubArrOfSizeK(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        // Queue<Integer> queue = new PriorityQueue<>();
        Deque<Integer> queue = new LinkedList<>();
        int i = 0, j = 0;

        while (j < n) {
            while (!queue.isEmpty() && queue.getLast() < arr[j]) {
                queue.removeLast();
            }
            queue.add(arr[j]);

            if (j - i + 1 < k) {
                j++;
            } else {
                list.add(queue.peek());

                if (!queue.isEmpty() && queue.getFirst() == arr[i]) {
                    queue.removeFirst();
                }
                i++;
                j++;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();

    }

    static int[] bruteForce(int[] arr, int k) {
        int n = arr.length;

        int[] ans = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            ans[idx++] = max;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxOfAllSubArrOfSizeK(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3)));
        System.out.println(Arrays.toString(maxOfAllSubArrOfSizeK(new int[] { -7, -8, 7, 5, 7, 1, 6, 0 }, 4)));

    }
}
