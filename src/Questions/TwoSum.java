package Questions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static int[] bruteForce(int[] arr, int target) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+ arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    private static int[] optimalApproach(int[] arr, int target) {
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = target - arr[i];
            if(map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            map.put(arr[i], i);
        }

        return new int[] {-1, -1};
    }

    private static boolean usingTwoPointer(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;

        int left = 0, right = n-1;

        while(left <= right) {
            int sum = arr[left]+ arr[right];

            if(sum > target) right--;
            else if(sum < target) left++;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Running..");
        int []arr = {0, 1, 2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(bruteForce(arr, target)));
        System.out.println(Arrays.toString(optimalApproach(arr, target)));
        System.out.println(usingTwoPointer(arr, target));
    }
}
