package SlidingWindow;

public class Practice4 {

    public static void main(String[] args) {
        var arr = new int[]{4, 1, 1, 1, 2, 3, 5};

        // will be work only for positive integers....
        System.out.println(solve(arr, 5));
    }

    private static int solve(int[] arr, int k) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        int i = 0, j = 0;
        long sum = 0;

        while (j < n) {
            sum += arr[j];

            if(sum < k){
                j++;
            }else if(sum == k){
                max = Math.max(max, j-i+1);
                j++;
            }else if(sum > k){
                while (sum > k) {
                    sum -= arr[i];
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}