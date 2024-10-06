package DP.AdityaVerma;

public class SubsetSum {
    static boolean solve(int arr[], int sum) {

        boolean dp[][] = new boolean[arr.length + 1][sum + 1];
        // matrix initilization
        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    dp[i][j] = false;
                }
                if (j == 0) {
                    dp[i][j] = true;
                }
            }
        }


        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j- arr[i-1]] || dp[i-1][j]; 
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[arr.length][sum];
    }

    public static void main(String[] args) {
        System.out.println("Running....");
        boolean ans = solve(new int[]{2, 3, 7, 8, 10}, 15);
        System.out.println(ans);
    }
}