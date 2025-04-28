package BinarySearch;

public class Leetcode2302 {

    private static long solve(int[] arr, long k) {
        int n = arr.length;
        // System.out.println(solve(new int[]{2,1,4,3,5}, 10));

        long sum = 0;
        long count = 0;

        int i = 0, j = 0;

        while (j < n) {
            sum += arr[j];
            while (sum * (j - i + 1) >= k) {
                sum -= arr[i];
                i++;
            }
            count += j - i + 1;
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[] { 2, 1, 4, 3, 5 }, 10));
    }
}