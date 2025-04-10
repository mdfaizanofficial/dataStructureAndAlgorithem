package SlidingWindow;

import java.util.HashMap;

public class CountNoAnagrams {
    private static int bruteForce(String str, String pattern) {
        int n = str.length();
        int m = pattern.length();
        if(m > n) return -1;

        int i = 0;
        int j = m-1;
        int count = 0;

        while(j < n) {
            String subStr = str.substring(i, j+1);
            if(isAnagram(subStr, pattern)){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }

    private static boolean isAnagram(String subStr, String pattern) {

        int map[] = new int[27];

        for(char ch : subStr.toCharArray()){
            map[ch-'a']++;
        }
        for(char ch : pattern.toCharArray()){
            map[ch-'a']--;
        }

        for (int i = 0; i < map.length; i++) {
            if(map[i] != 0) return false;
        }
        return true;
    }

    private static int usingSlidingWindow(String str, String pattern){
        int n = str.length();
        int k = pattern.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char  ch : pattern.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int i = 0, j = 0;
        int count = map.size();
        int ans = 0;

        while (j < n) {
            if(map.containsKey(str.charAt(j))){
                map.put(str.charAt(j), map.get(str.charAt(j))-1);
                if(map.get(str.charAt(j)) == 0){
                    count--;
                }
            }

            if(j - i + 1 < k){
                j++;
            }else{
                if(count == 0){
                    ans++;
                }

                if(map.containsKey(str.charAt(i))){
                    if(map.get(str.charAt(i)) == 0) count++;
                    
                    map.put(str.charAt(i), map.get(str.charAt(i))+1);
                }

                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "aabaabaa";
        String pattern = "aaba";

        System.out.println(bruteForce(str, pattern));
        System.out.println(usingSlidingWindow(str, pattern));

    }
}
