package Questions;

public class ReverseBit {
    public static int reverseBits(int n) {
        int len = findLength(n);

        int ans = 0;

        while(n > 0){
            if(n%10 == 1){
                ans += 1*Math.pow(2, len);
            }
            len--;
            n/=10;
        }
        return ans;
    }
    static int findLength(int n){
        String s = Integer.toString(n);
        return s.length();
    }
    
    public static void main(String[] args) {
        System.out.println(reverseBits(00000010100101000001111010011100));
    }
}