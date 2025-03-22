package Questions;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    private static int[] nextSmall(int[] arr){
        var n = arr.length;

        var nse = new int[n];

        var stack = new Stack<Integer>();

        for(int i = n-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                nse[i] = -1;
            }else{
                nse[i] = stack.peek();
            }

            stack.push(arr[i]);
        }
        return nse;
    }
    public static void main(String[] args) {
        var arr = new int[]{ 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(nextSmall(arr)));
    }
}
