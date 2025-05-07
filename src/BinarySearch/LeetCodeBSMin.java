package BinarySearch;

public class LeetCodeBSMin {
    private static int solve(int[] nums) {
        int n = nums.length;

        int minIdx = findMinIdx(nums);

        return nums[minIdx];
    }

    private static int findMinIdx(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left <  right) {
            int mid = left + (right - left)/2;

            if(arr[mid] > arr[right]){
                left = mid+1;
            }else if(arr[mid] < arr[right]){
                right = mid;
            }else{
                right--;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{3,3,1,3}));
        System.out.println(findMinIdx(new int[]{3,3,0,0,1,1,3}));
    }
}
