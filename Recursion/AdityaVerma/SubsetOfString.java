package Recursion.AdityaVerma;

public class SubsetOfString {
    static int idx = 0;

    static void subset(String input, String output) {
        if (input.length() == 0) {

            if (output.length() == 0) {
                System.out.println(idx + " -> {Empty}");
                idx++;
                return;
            }

            System.out.println(idx + " -> " + output);
            idx++;
            return;
        }
        String output1 = output;
        String output2 = output + input.charAt(0);

        input = input.substring(1, input.length());

        subset(input, output1);
        subset(input, output2);

    }

    public static void main(String[] args) {
        System.out.println("SubsetOfString.main()");
        String s = "abcd";
        subset(s, "");
    }
}
