package src.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class MissingAndRepeatingValue {
    public static void main(String[] args) {
        System.out.println("Welcome");

        int[][] matrix = {
                { 9, 1, 7 },
                { 8, 9, 2 },
                { 3, 4, 6 }
        };

        int ans[] = findMissAndRepeatEle(matrix);
        System.out.println("Answer is :" + Arrays.toString(ans));
        int ans2[] = secondApproach(matrix);
        System.out.println("Answer is :" + Arrays.toString(ans2));
    }

    private static int[] secondApproach(int[][] matrix) {
        int n = matrix.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                map.put(matrix[i][j], map.getOrDefault(matrix[i][j], 0)+1);
            }
        }

        int values = n*n;
        int[] ans = {-1, -1};

        while(values > 0) {
            if(!map.containsKey(values)){
                ans[1] = values;
                values--;
                continue;
            }
            if(map.get(values) > 1) {
                ans[0] = values;
            }
            
            values--;
        }
        return ans;



        
        
                
    }

    private static int[] findMissAndRepeatEle(int[][] matrix) {
        int n = matrix.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map.put(matrix[i][j], map.getOrDefault(matrix[i][j], 0) + 1);
            }
        }

        int itr = 1;

        int[] ans = { -1, -1 };

        for (int val : map.keySet()) {

            if (map.get(val) > 1) {
                ans[0] = val;
            }
            if (!map.containsKey(itr)) {
                ans[1] = itr;
            }
            itr++;
        }

        return ans;
    }

}
