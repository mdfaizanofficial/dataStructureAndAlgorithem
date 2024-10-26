package DP.AdityaVerma;
import java.util.*;
class SubsetSum{
    private static boolean recursive(int[] arr, int n, int sum){
        if(n == 0 || sum == 0){
            if(sum == 0){
                return true;
            }
            return false;
        }
        
        if(arr[n-1] <= sum){
            return recursive(arr, n-1, sum-arr[n-1]) || recursive(arr, n-1, sum);
        }else{
            return recursive(arr, n-1, sum);
        }
    }

    static boolean[][] dp;
    private static boolean memoization(int arr[], int sum, int n){
        if(n == 0 || sum == 0){
            if(sum == 0){
                return true;
            }
            return false;
        }
        if(dp[n][sum] == true){
            return dp[n][sum];
        }

        if(arr[n-1] <= sum){
            return dp[n][sum] = memoization(arr, sum-arr[n-1], n-1) || memoization(arr, sum, n-1);
        }else{
            return dp[n][sum] = memoization(arr, sum, n-1);
        }
    }
    private static boolean topDown(int[] arr, int n, int sum){
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < sum+1; j++){
                if(i == 0){
                    dp[i][j] = false;
                }
                if(j == 0){
                    dp[i][j] = true;
                }
            }
        }
        for(int i = 1; i < n+1; i++){
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][sum];
    }
    public static void main(String[] args) {
        System.out.println("SubsetSum.main()");
        int[] arr = {2,3,7,8,10};
        int sum = 16; 
        int n = arr.length;
        dp = new boolean[n+1][sum+1];
        System.out.println(recursive(arr, n, sum));
        System.out.println(memoization(arr, sum, n));
        System.out.println(topDown(arr, n, sum));
    }
}