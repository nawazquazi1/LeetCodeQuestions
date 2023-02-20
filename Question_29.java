import java.util.Stack;


public class Question_29 {
    public static void main(String[] args) {
        Infix_Evaluation("2+6*4/8-3");
    }

    public static void Infix_Evaluation(String exp) {
        Stack<Integer> stack = new Stack<>();
        Stack<Character> opa = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '(') {
                opa.push(c);
            } else if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else if (c == ')') {
                while (opa.peek()!='(') {
                    char op = opa.pop();
                    int v2 = stack.pop();
                    int v1 = stack.pop();
                    int v = operation(v1, v2, op);
                    stack.push(v);
                }
                opa.pop();
            } else if (c== '+' || c == '-' || c == '*' || c == '/') {
                while (opa.size() > 0 && opa.peek() != '(' && Precedence(c) <= Precedence(opa.peek())) {
                    char optor = opa.pop();
                    int v2 = stack.pop();
                    int v1 = stack.pop();
                    int opv = operation(v1, v2, optor);
                    stack.push(opv);
                }
                opa.push(c);
            }
        }
        while (opa.size() != 0) {
            char optor = opa.pop();
            int v2 = stack.pop();
            int v1 =stack.pop();
            int opv = operation(v1, v2, optor);
            stack.push(opv);
        }
        System.out.println(stack.peek());

    }

    private static int operation(int v1, int v2, char optor) {
        if (optor == '+') {
            return v1 + v2;
        } else if (optor == '-') {
            return v1 - v2;
        } else if (optor == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
    private static int Precedence(char optor) {
        if (optor == '+') {
            return 1;
        } else if (optor == '-') {
            return 1;
        } else if (optor == '*') {
            return 2;
        } else {
            return 2;
        }
    }
}
