package Questions;

import java.util.HashSet;
public class HappyNumber202 {
    
    public static void main(String[] args) {
        HappyNumber202 obj = new HappyNumber202();

        System.out.println(obj.solve(19));
    }

    // using fast-slow pointer......

    private boolean usingPointer(int n ) {
        return false;
    }

    // using set........
    private boolean solve(int n) {
        int num = n;
        HashSet<Integer> set = new HashSet<>();
        set.add(num);
        while(num != 1){
            num = digitSquare(num);
            if(num == 1) return true;
            if(set.contains(num)){
                return false;
            }
            set.add(num);
        }

        return true;
    }

    private int digitSquare(int n){
        int ans = 0;

        while(n > 0) {
            int val = n % 10;
            ans += (val*val);

            n/= 10;
        }
        return ans;
    }
}
