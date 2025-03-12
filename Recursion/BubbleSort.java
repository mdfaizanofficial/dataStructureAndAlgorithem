package Recursion;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2,5,1,6,3};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int idx, int size) {
        if(idx == size-2){
            return;
        }

        if(arr[idx] < arr[idx+1]){
            int temp = arr[idx];
            arr[idx] = arr[idx+1];
            arr[idx+1] = temp;
            
            sort(arr, idx+1, size);
        }else{
            sort(arr, idx, size-1);
        }
    }
}
