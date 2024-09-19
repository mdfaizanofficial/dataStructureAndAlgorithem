package recursion.adityaverma;
import java.util.ArrayList;

public class LetterCaseParmutation {
    static ArrayList<String> parmutation(String s){
        String input = s;
        String output = "";
        ArrayList<String> result = new ArrayList<>();

        solve(input, output, result);
        
        return  result;
    }
    public static void main(String[] args){
        System.out.println("running...");

        ArrayList<String> result = parmutation("a1B2");
        System.out.println(result);
    }

    private static void solve(String input, String output, ArrayList<String> result) {

        if(input.isEmpty()){
            result.add(output);
            return;
        }
        
        if(Character.isAlphabetic((input.charAt(0)))){
            String ch1 = ""+input.charAt(0);
            ch1 = ch1.toLowerCase();
            String output1 = output+ch1;

            String ch2 = ""+input.charAt(0);
            ch2 = ch2.toUpperCase();
            String output2 = output+ch2;

            input = input.substring(1,input.length());


            solve(input, output1, result);
            solve(input, output2, result);
        }else{
            String output1 = output + input.charAt(0);
            input = input.substring(1,input.length());
            solve(input, output1, result);
        }
    }
}
