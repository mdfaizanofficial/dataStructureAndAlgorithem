package Recursion.AdityaVerma;

public class ParmutationWithSpace {

    static void permutation(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        String output1 = output+input.charAt(0);
        String output2 = output+"_"+input.charAt(0);
        input = input.substring(1, input.length());
        permutation(input, output1);
        permutation(input, output2);
    }

    public static void main(String[] args) {
        System.out.println("PermutationWithSpace.main()");
        String input = "abc";
        String output = ""+input.charAt(0);
        input = input.substring(1, input.length());
        permutation(input, output);
    }
}
