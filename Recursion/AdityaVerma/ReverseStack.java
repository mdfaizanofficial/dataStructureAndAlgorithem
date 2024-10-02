package Recursion.AdityaVerma;

import java.util.Stack;

public class ReverseStack {
    static void reverse(Stack<Integer> stack){
        if(stack.size() <= 1) return;
        int lastValue = stack.pop();
        reverse(stack);
        insert(stack,lastValue);
    }
    public static void main(String[] args) {
        System.out.println("ReverseStack.main()");

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(2);
        stack.push(40);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }

    private static void insert(Stack<Integer> stack, int value) {
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }
        
        int lastValue = stack.pop();
        insert(stack, value);
        stack.push(lastValue);
    }
}
