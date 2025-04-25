package Questions;

import java.util.HashMap;
import java.util.Map;

public class CountLargestSum {

    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 1; i <= n; i++) {
            int val = digSum(i);
            map.put(val, map.getOrDefault(val, 0)+1);
            max = Math.max(max, map.get(val));
        }

        int count = 0;
        for(int val : map.values()){
            if(max == val){
                count++;
            }
        }
        return count;
    }
    int digSum(int x){
        var sum = 0;
        while(x > 0){
            sum += x%10;
            x/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        CountLargestSum obj = new CountLargestSum();
        System.out.println(obj.countLargestGroup(13)); // Output: 4
        // System.out.println(obj.countLargestGroup(2)); // Output: 2
        // System.out.println(obj.countLargestGroup(15)); // Output: 5
    }
}