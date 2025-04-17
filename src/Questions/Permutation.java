package Questions;

public class Permutation {

    public static void main(String[] args) {
        printPermutations("abc",0);
    }

    private static void printPermutations(String string, String ans, int idx) {
        if(idx == string.length()){
            System.out.println(ans);
        }

        for(int i = 0; i < string.length(); i++){
            
        }
    }
}