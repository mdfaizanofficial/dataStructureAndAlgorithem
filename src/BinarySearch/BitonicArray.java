package BinarySearch;
public class BitonicArray {
    private static int maxInBitonic(int[] arr) {
        int n = arr.length;

        int left = 0, right = n-1;
        // int arr[] = {2, 4, 6, 8, 12, 7, 5};
        while (left <= right) {
            int mid = left+(right-left)/2;

            if(mid != 0 && mid != n-1){
                if(arr[mid]>arr[mid-1] && arr[mid] > arr[mid+1]){
                    return mid;
                }else if(arr[mid-1] < arr[mid]) {
                    left = mid +1;
                }else{
                    right = mid-1;
                }
            }else if(mid == 0){
                if(arr[mid] > arr[mid+1]){
                    return mid;
                }else{
                    return -1;
                }
            }else if(mid == n-1){
                if(arr[mid-1] > arr[mid-2]){
                    return mid;
                }else{
                    return -1;
                }
            }
        }
        return -1;
    }

    static int findInBitonic(int[] arr, int k){
        int n = arr.length;
        int maxIdx = maxInBitonic(arr);

        int left = ascBS(arr,0,maxIdx-1, k);
        int right = descBS(arr,maxIdx,n-1, k);

        if(left != -1){
            return left;
        }else if(right != -1){
            return right;
        }else{
            return -1;
        }
    }

    static int ascBS(int arr[],int left, int right, int k){
        while (left <= right) {
            int mid = left + (right-left);
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] < k){
                left = mid +1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    static int descBS(int arr[],int left, int right, int k){
        while (left <= right) {
            int mid = left + (right-left);
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] > k){
                left = mid +1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 12, 7, 5};
        System.out.println(maxInBitonic(arr));
        System.err.println(findInBitonic(arr, 7));
    }
}
