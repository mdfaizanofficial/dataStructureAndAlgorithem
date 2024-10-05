package DP.AdityaVerma;

public class Knapshak01 {

    // recursion solution
    static int solve(int[] wt, int[] val, int w, int n){
        if(w == 0 || n ==0){
            return 0;
        }

        if(wt[n-1] <= w){
            int take = val[n-1] + solve(wt, val, w - wt[n-1], n-1);
            int skip = solve(wt, val, w, n-1);
            return Math.max(take, skip);
        }else{
            return solve(wt, val, w, n-1);
        }
    }

    // memoization
    static int dp[][];
    static int memo(int[] wt, int[] val, int w, int n){
        dp = new int[n+1][w+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= w; j++){
                dp[i][j] = -1;
            }
        }
        return helper(wt, val, w, n);

    
    }

    static int helper(int[] wt, int[] val, int w, int n){
        if(n == 0 || w == 0){
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }
        if(wt[n-1] > w){
            return dp[n][w] = helper(wt, val, w, n-1);
        }else{
            return dp[n][w] =Math.max(val[n-1] + helper(wt, val, w- wt[n-1], n-1), helper(wt, val, w, n-1));
        }
    }


    // top down approach 
    static int topDown(int wt[], int val[], int w, int n){
        int dp[][] = new int[n+1][w+1];
        // initailization 
        for (int i = 0; i < n+1; i++) {
            for(int j = 0; j < w+1; j++){
                if(i == 0 || j ==0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < n+1; i++){
            for (int j = 0; j < w+1; j++) {
                
                if(wt[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j - wt[i-1]], dp[i-1][j]);
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

        int result = memo(wt, val, w, n);
        System.out.println(result);

    }
}
