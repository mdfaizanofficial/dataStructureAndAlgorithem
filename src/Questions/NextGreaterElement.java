package Questions;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    private static int[] nextGreater(int[] arr) {
        int n = arr.length;

        int[] nge = new int[n];

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    nge[i] = arr[j];
                    break;
                }
            }
            if (nge[i] == 0) {
                nge[i] = -1;
            }
        }
        return nge;
    }

    private static int[] ngeUsingStack(int[] arr) {
        var n = arr.length;

        var stack = new Stack<Integer>();

        var nge = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nge[i] = stack.peek();
            }else{
                nge[i] = -1;
            }
            stack.push(arr[i]);
        }
        return nge;
    }

    private static int[] ngeCycle(int[] arr) {
        int n = arr.length;

        var stack = new Stack<Integer>();

        var nge = new int[n];

        for (int i = n*2 -1; i >=0 ; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i%n]) {
                stack.pop();
            }

            if(i < n){
                if (!stack.isEmpty()) {
                    nge[i] = stack.peek();
                }else{
                    nge[i] = -1;
                }
            }
            stack.push(arr[i%n]);
        }
        return nge;
    }

    public static void main(String[] args) {
        var arr = new int[] { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nextGreater(arr)));
        System.out.println(Arrays.toString(ngeUsingStack(arr)));
        System.out.println(Arrays.toString(ngeCycle(arr)));

    }
}
