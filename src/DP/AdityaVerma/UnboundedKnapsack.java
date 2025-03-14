package DP.AdityaVerma;

public class UnboundedKnapsack {
    private static int solve(int[] arr, int target, int n){
        if(n == 0 || target == 0){
            return 0;
        }

        if(arr[n-1] <= target){
            return Math.max(
                arr[n-1] + solve(arr, target-arr[n-1], n),
                solve(arr, target, n-1)
                );
        }else{
            return solve(arr, target, n-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,7,6};

        System.out.println(solve(arr, 4, arr.length));
    }
}
