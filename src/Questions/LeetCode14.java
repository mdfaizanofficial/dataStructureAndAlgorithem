package Questions;

import java.util.Arrays;
import java.util.Comparator;

class LeetCode14 {
    private static String optimize(String strs[]){
        int n = Integer.MAX_VALUE;
        for(var str : strs){
            n = Math.min(n, str.length());
        }
        if(n == 0) return "";

      Arrays.sort(strs, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(strs));

        int left = 0, right = strs.length-1;
        String ans = "";

        for(int i = 0; i < n; i++) {
            if( (i < strs[left].length() && i < strs[right].length()) && (strs[left].charAt(i) == strs[right].charAt(i))){
                ans += strs[left].charAt(i);
            }else{
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(optimize(new String[]{"flower","flow","flight"}));
    }
    
}