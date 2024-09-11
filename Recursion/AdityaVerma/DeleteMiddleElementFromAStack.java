package Recursion.AdityaVerma;
import java.util.Stack;

public class DeleteMiddleElementFromAStack {

    static void deleteMiddleElement(Stack<Integer> stack){
        helper(stack, stack.size()/2);
    }
    static void helper(Stack<Integer> stack, int i) {
        if(i<=0){
            stack.pop();
            return;
        }

        int lastValue = stack.pop();
        helper(stack, i-1);
        stack.add(lastValue);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello stack...");
        Stack<Integer> stack = new Stack<>();

        for(int i = 1; i <= 10; i++){
            stack.add(i);
        }
        System.out.println(stack);
        deleteMiddleElement(stack);
        System.out.println(stack);
    }

}
