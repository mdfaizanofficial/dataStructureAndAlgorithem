package Recursion.AdityaVerma;

import java.util.Stack;

public class SortStack {
    static void sort(Stack<Integer> stack){
        if(stack.size() == 1) return ;

        int lastValue = stack.pop();
        sort(stack);
        insert(stack, lastValue);
    }
    private static void insert(Stack<Integer> stack, int value) {
        if(stack.isEmpty() || stack.peek() <= value){
            stack.push(value);
            return;
        }

        int lastValue = stack.pop();
        insert(stack, value);
        stack.push(lastValue);

    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(9);
        stack.push(4);
        System.out.println(stack);

        sort(stack);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        
    }

}
