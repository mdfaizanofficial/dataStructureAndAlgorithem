package SlidingWindow;

import java.util.LinkedList;
import java.util.Queue;

public class Practice2 {
    private static void printFirstNegative(int[] arr, int k) {
        int n = arr.length;
        Queue<Integer> queue = new LinkedList<>();

        int i = 0, j = 0;

        while (j < n) {
            if(arr[j] < 0){
                queue.add(arr[j]);
            }

            if(j - i+1 < k){
                j++;
            }else if(j - i+1 == k){
                if(!queue.isEmpty()){
                    System.out.print(queue.peek()+" ");
                }else{
                    System.out.print(0+" ");
                }

                if(!queue.isEmpty() && arr[i] == queue.peek()){
                    queue.remove();
                }

                i++;
                j++;
            }
        }

    }
    public static void main(String[] args) {
        var arr = new int[]{12, -1, -7, 8, -15, 30, 16, 28};

        printFirstNegative(arr, 3);
    }
}
