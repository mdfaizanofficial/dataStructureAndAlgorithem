package Questions;

public class LeetCode2873 {

    private static long solve(int[] nums) {
        int n = nums.length;

        long max = Integer.MIN_VALUE;

        for(int i = 0; i < n-2; i++) {
            for(int j = i+1; j < n-1; j++) {
                for(int k = j+1; k < n; k++) {
                    long operation = (long)(nums[i] - nums[j]) * nums[k];

                    max = Math.max(max, operation);
                }
            }
        }
        return (max <= 0)?0:max;
    }

    public static void main(String[] args) {
        var arr = new int[]{1000000,1,1000000};

        System.out.println(solve(arr));
    }
}