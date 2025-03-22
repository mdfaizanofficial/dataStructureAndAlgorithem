package Questions;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if ((!st.empty()) && ((st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']')
                    || (st.peek() == '{' && ch == '}'))) {
                st.pop();
            } else {
                return false;
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter you String: ");
        String str = input.nextLine();
        System.out.println(isValid(str));
    }
}
