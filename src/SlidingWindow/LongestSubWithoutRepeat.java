package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubWithoutRepeat {
    private static int solve2(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        int i = 0, j = 0;

        while (j < n) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);

            if(map.size() == j - i +1){
                max = Math.max(max, j - i +1);
                j++;
            }else if(map.size() < j - i+1){
                while (!map.isEmpty() && map.size() < j - i+1) {
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)-1);
                    if(map.get(s.charAt(i)) < 1){
                        map.remove(s.charAt(i));
                    }
                    i++;

                }
                j++;
            }
        }
        return max;
    }
    private static int solve(String s){
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        int i = 0, j = 0;

        while(j < n) {
            if(map.containsKey(s.charAt(j))){
                while (!map.isEmpty() && s.charAt(i) != s.charAt(j)) {
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i)) < 1){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i)) < 1){
                    map.remove(s.charAt(i));
                }
                i++;
            }else{
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
                max = Math.max(max, j-i+1);

                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solve("aabcdfarastruon"));
        System.out.println(solve2("aabcdfarastruon"));
    }


}
