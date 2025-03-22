package Questions;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElement {
    private static int[] previousSmallerElement(int[] arr) {
        int n = arr.length;

        var pse = new int[n];
        var stack = new Stack<Integer>();

        for(int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if(stack.isEmpty()){
                pse[i] = -1;
            }else{
                pse[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return pse;
    }
    public static void main(String[] args) {
        var arr = new int[] { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(previousSmallerElement(arr)));

    }
}
