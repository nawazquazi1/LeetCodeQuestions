import java.util.Stack;

public class Question_5 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.peek() == '(') {
                    st.pop();
                } else if (st.peek() != '(') {
                    return false;
                }
            } else if (ch == ']') {
                if (st.peek() == '[') {
                    st.pop();
                } else if (st.peek() != '[') {
                    return false;
                }
            } else if (ch == '}') {
                if (st.peek() == '{') {
                    st.pop();
                } else if (st.peek() != '{') {
                    return false;
                }
            }
        }
        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("(]"));
    }
}
