package BinarySearch;

public class BS {
    static int simpleBS(int arr[], int k) {
        int n = arr.length;

        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1; // if not fount;
    }

    static int simpleBS(int arr[], int k, int left, int right) {

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1; // if not fount;
    }

    static int leftOccBS(int arr[], int k) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right-left)/2;

            if(arr[mid] == k){
                ans = mid;
                right = mid-1;
            }else if(arr[mid] > k){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }

    static int rightOccBS(int arr[], int k) {
        int n = arr.length;

        int left = 0, right = n-1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if(arr[mid] == k) {
                ans = mid;
                left = mid + 1;
            }else if(arr[mid] > k){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }

    static int countNoOccBS(int[] arr, int k){
        int n = arr.length;

        int leftOcc = leftOccBS(arr, k);
        int rightOcc = rightOccBS(arr, k);
        if(leftOcc == -1 || rightOcc == -1){
            return -1;
        }else{
            return rightOcc - leftOcc +1;
        }
    }

    static int countNoRotations(int[] arr) {
        int n = arr.length;

        int minIdx = findMin(arr);
        if(minIdx != 0)
            return n-minIdx;
        else 
            return 0;
    }

    static int findMin(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left <  right) {
            int mid = left + (right - left)/2;

            if(arr[mid] > arr[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left; // 'left' will point to the minimum element
    }

    static int rotatedSortedBS(int arr[], int k){
        int n = arr.length;

        int min = findMin(arr);
        if(min == 0){
            return simpleBS(arr, k);
        }

        int left = simpleBS(arr, k, 0, min-1);
        if (left != -1) {
            return left;
        }
        return simpleBS(arr, k, min, n-1);
    }

    static int nearlySortedBS(int[] arr, int k){
        int n = arr.length;

        int left = 0, right = n-1;

        while (left <= right) {
            int mid = left+(right-left)/2;

            if(arr[mid] == k){
                return mid;
            }
            if(mid +1 <= right && arr[mid+1] == k){
                return mid+1;
            }
            if(mid -1 >= left && arr[mid-1] == k){
                return mid-1;
            }

            if(mid-1 >= left && arr[mid] > k && arr[mid-1] > k){
                right = mid-1;
            }else{
                left = mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3};
        // System.out.print("Enter k :");
        // int k = Integer.parseInt(System.console().readLine());
        // // System.out.println("Normal BS:\t\t"+simpleBS(arr, k));
        // System.out.println("Left Occurence BS:-> \t"+leftOccBS(arr, k));
        // System.out.println("Right Occurence BS:-> \t"+rightOccBS(arr, k));
        // System.out.println("Count OCcurence BS:-> \t"+countNoOccBS(arr, k) );
        // System.out.println(findMin(arr));
        // System.out.println(countNoRotations(arr));
        // System.out.println(rotatedSortedBS(arr, 5));

        int[] nearlySortedArr = {5, 10, 30, 40, 35};
        System.out.println(nearlySortedBS(nearlySortedArr, 2));
        

    }
}
