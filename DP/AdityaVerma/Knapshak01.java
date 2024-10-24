package DP.AdityaVerma;

import java.util.Arrays;

public class Knapshak01 {
    // Recursive solution
    public static int knapshak(int wt[], int val[], int w, int n){
        if(n == 0 || w == 0){
            return 0;
        }
        
        if(wt[n-1] <= w){
            return Math.max(val[n-1]+knapshak(wt, val, w - wt[n-1], n-1), knapshak(wt, val, w, n-1));
        }else{
            return knapshak(wt, val, w, n-1);
        }
        
    }

    // Memoization 
    static int[][] dp;
    public static int memoization(int[] wt, int[] val, int w, int n){
        if(n == 0 || w == 0){
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }
        if(wt[n-1] <= w){
            return dp[n][w] = Math.max(val[n-1] + memoization(wt, val, w-wt[n-1], n-1), memoization(wt, val, w, n-1));
        }else{
            return dp[n][w] = memoization(wt, val, w, n-1);
        }
    }

    public static int topDown(int[] val, int[] wt, int w, int n){
        int dp[][] = new int[n+1][w+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < w+1; j++) {
                if(j == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < w+1; j++){
                if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][w];

    }
    public static void main(String[] args) {
        System.out.println("Running....");
        int wt[] = {1,2,3,4};
        int val[] = {1,3,4,5};
        int n = val.length;
        int w = 7;

        dp = new int[n+1][w+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < w+1; j++) {
                dp[i][j] = -1;
            }
        }

        // int result = knapshak(wt, val, w, n);
        // System.out.println(result);

        // int result2 = memoization(wt, val, w, n);
        // System.out.println(result2);

        // for (int[] i : dp) {
        //     System.out.println(Arrays.toString(i));
        // }

        int result3 = topDown(val, wt, w, n);
        System.out.println(result3);

    }
}
