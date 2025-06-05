package STACK;

import java.util.Stack;

public class PrefixToInfix {

    // Method to check if a character is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Method to convert prefix expression to infix expression
    public static String prefixToInfix(String prefix) {
        Stack<String> stack = new Stack<>();

        // Split the prefix expression into tokens and reverse the order
        String[] tokens = prefix.split("\\s+");
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (!isOperator(token.charAt(0))) {
                // If the token is an operand, push it to the stack
                stack.push(token);
            } else {
                // If the token is an operator, pop two operands from the stack
                String operand1 = stack.pop(); // First operand
                String operand2 = stack.pop(); // Second operand

                // Create a new infix expression
                String newExpr = "(" + operand1 + " " + token + " " + operand2 + ")";
                stack.push(newExpr); // Push the new expression back onto the stack
            }
        }

        // The last remaining item on the stack is the full infix expression
        return stack.pop();
    }

    public static void main(String[] args) {
        String prefix = "* + A B - C D";
        String infix = prefixToInfix(prefix);
        System.out.println("Prefix: " + prefix);
        System.out.println("Infix: " + infix);
    }
}
