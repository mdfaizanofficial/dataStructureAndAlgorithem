package SlidingWindow;

public class Practice1 {
    private static int maxSum(int arr[], int k){
        int n = arr.length;

        int max = 0;

        for(int i = 0; i <= n - k; i++){
            int count = 0;

            for (int j = i; j < i+k; j++) {
                count += arr[j];
            }

            max = Math.max(max, count);
        }
        return max;
    }

    private static int maxUsingWindow(int arr[], int k){
        int n = arr.length;
        int max = 0;
        int curr = 0;

        int i = 0, j = 0;
        while(j < n) {
            curr += arr[j];
            if(j - i + 1 < k){
                j++;
            }else if(j - i + 1 == k){
                max = Math.max(curr, max);
                curr -= arr[i];
                i++;
                j++;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        var arr = new int[]{202,32,22,45,96,-404,7,54,3};
        System.out.println(maxSum(arr, 3));

        System.out.println(maxUsingWindow(arr, 3));
    }
}
