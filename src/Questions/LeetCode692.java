package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class LeetCode692 {

    private static List<String> solve(String[] words, int k){
        int n = words.length;

        var map = new HashMap<String, Integer>();

        for(String str : words){
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        var str = map.keySet().stream().sorted((a,b) ->{
            int diff = map.get(b) - map.get(a);
            if(diff == 0){
                return a.compareTo(b);
            }
            return diff;
        }).toList();
        var ans = new ArrayList<String>();

        for(int i  = 0; i < k; i++){
            ans.add(str.get(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 4));
    }
}