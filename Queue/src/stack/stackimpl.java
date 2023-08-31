package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class stackimpl {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("element1");
        stack.push("element2");
        stack.push("element3");
        stack.push("element4");

        // Peeking at the top element
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Popping elements from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        String topElement2 = stack.peek();
        System.out.println("Top element: " + topElement2);


        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        // Getting the size of the stack
        int stackSize = stack.size();
        System.out.println("Stack size: " + stackSize);
    }
    }

