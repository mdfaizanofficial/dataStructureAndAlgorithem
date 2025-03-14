package Questions;

import java.util.Arrays;

public class ThreeSum {

    private static int[] bruteForce(int[] arr, int target) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int k = j+1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == target){
                        return new int[]{arr[i], arr[j], arr[k]};
                    }
                }
            }
        }
        return new int[]{-1, -1, -1};
    }
    public static void main(String[] args) {
        System.out.println("Running....");

        int[] arr = {2, 4, 5, 6, 3, 2, 4, 5, 86};
        int target = 92;

        System.out.println(Arrays.toString(bruteForce(arr, target)));
    }
}
 