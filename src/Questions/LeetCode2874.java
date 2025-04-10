package Questions;

public class LeetCode2874 {

    private static long solve(int[] nums){
        int n = nums.length;
        if(n < 3) return 0;

        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        long ans = 0;

        // 16,15,12,5,4,12,15,17,5,18,6,16,1,17,4

        for(int i = 0; i < n-2; i++){
            if(nums[i] > max){
                max = nums[i];
                min = Math.min(max, nums[i+1]);
                ans = Math.max(ans, (max - min) * nums[i+2]);
            }else{
                min = Math.min(min, nums[i]);
                ans = Math.max(ans, (max - min) * nums[i+1]);
            }
        }

        return ans<0?0:ans;
    }



    // /home/faizan-furqan-ahmad/Pictures/Screenshots/Screenshot from 2025-04-04 01-19-25.png  // answer

    public static void main(String[] args) {
        var arr = new int[]{
            16,15,12,5,4,12,15,17,5,18,6,16,1,17,4
        };

        System.out.println(solve(arr));
    }
}