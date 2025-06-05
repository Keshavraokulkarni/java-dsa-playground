package STACK;

import java.util.Stack;

public class InfixToPostfix
{
    //Determine the precedence of operators
    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    //check if char is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c =='-' || c =='*' || c == '/' || c== '^';
    }

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i < infix.length(); i++) {
            char current = infix.charAt(i);

            //If the char is an operand, add it to output
            if(Character.isLetterOrDigit(current)) {
                postfix.append(current);
                postfix.append(' ');
            }
            //if char is '(' push it to the stack
            else if (current == '(') {
               stack.push(current);
            } else if (current == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                    postfix.append(' ');
                }
                stack.pop(); // pop '('
            }
            //If an operator is encountered
            else if (isOperator(current)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(current)) {
                    postfix.append(stack.pop());
                    postfix.append(' '); //Add space for seperation
                }
                stack.push(current);

            }
        }
        //pop all the operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
            postfix.append(' ');
        }
        return postfix.toString().trim();
    }

    // Method to convert infix expression to prefix expression
    public static String infixToPrefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        // Read the infix expression from right to left
        for (int i = infix.length() - 1; i >= 0; i--) {
            char current = infix.charAt(i);

            // If the character is an operand, add it to output
            if (Character.isLetterOrDigit(current)) {
                prefix.append(current);
            }
            // If the character is ')', push it to the stack
            else if (current == ')') {
                stack.push(current);
            }
            // If the character is '(', pop and output from the stack until ')' is found
            else if (current == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.append(stack.pop());
                }
                stack.pop(); // Pop ')'
            }
            // If an operator is encountered
            else if (isOperator(current)) {
                while (!stack.isEmpty() && precedence(stack.peek()) > precedence(current)) {
                    prefix.append(stack.pop());
                }
                stack.push(current);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        // Reverse the constructed prefix expression to get the final result
        return prefix.reverse().toString(); // Reverse the output to get prefix
    }

    // Method to convert postfix expression to infix expression
    public static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();

        // Split the postfix expression into tokens
        String[] tokens = postfix.split("\\s+");

        for (String token : tokens) {
            if (!isOperator(token.charAt(0))) {
                // If the token is an operand, push it to the stack
                stack.push(token);
            } else {
                // If the token is an operator, pop two operands from the stack
                String operand2 = stack.pop(); // The second operand
                String operand1 = stack.pop(); // The first operand

                // Create a new infix expression
                String newExpr = "(" + operand1 + " " + token + " " + operand2 + ")";
                stack.push(newExpr); // Push the new expression back onto the stack
            }
        }

        // The last remaining item on the stack is the full infix expression
        return stack.pop();
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
        String infix = "A + B * C - D";
        String postfix = infixToPostfix(infix);
        System.out.println("INFIX:"+ infix);
        System.out.println("POSTFIX:"+ postfix);
        String prefix = infixToPrefix(infix);
        System.out.println("PREFIX:"+prefix);
        String postfixToInfix = postfixToInfix(postfix);
        System.out.println("POSTFIX to INFIX:"+ postfixToInfix);

    }

}

