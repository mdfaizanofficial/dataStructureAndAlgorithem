package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LargestSubstringWithKUnique {
    private static int solve(String s, int k) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int ans = -1;
        int i = 0, j = 0;

        while (j < n) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);

            if(map.size() < k){
                j++;
            }else if(map.size() == k){
                ans = Math.max(ans, j-i+1);
                j++;
            }else if(map.size() > k){
                while (!map.isEmpty() && map.size() > k) {
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        var s = "aabacbebebe";
        System.out.println(solve(s, 3));
    }
}
