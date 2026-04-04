import java.util.Stack;

public class InfixToPostfix {

    static int precedence(char ch) {
        switch (ch) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
        }
        return -1;
    }

    static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }

            // Left parenthesis
            else if (ch == '(') {
                stack.push(ch);
            }

            // Right parenthesis
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // remove '('
            }

            // Operator
            else {
                while (!stack.isEmpty() &&
                       precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String exp = "A+B*(C-D)";
        System.out.println(infixToPostfix(exp));
    }
}