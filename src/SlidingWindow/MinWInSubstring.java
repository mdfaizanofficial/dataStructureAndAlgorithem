package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinWInSubstring {

    static int solve(String s, String t) {
        int n = s.length();

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int ans = Integer.MAX_VALUE;
        int count = map.size();

        int i = 0, j = 0;
        while (j < n) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                if (map.get(s.charAt(j)) == 0) {
                    count--;
                }
            }

            while (count == 0) {
                ans = Math.min(ans, j - i + 1);
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    if (map.get(s.charAt(i)) > 0) {
                        count++;
                    }
                }
                i++;
            }

            j++;
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(solve(s, t)); // Output: 4
        // Explanation: The minimum window substring is "BANC" which is of length 4.
        // Note that "A" and "B" are not included in the substring.
        // The minimum window substring is "BANC" which is of length 4.
    }
}