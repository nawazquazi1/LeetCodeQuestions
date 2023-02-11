import java.util.Stack;

public class Question_23 {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> helperStack = new Stack<>();

    public Question_23() {

    }

    public void push(int x) {
        mainStack.push(x);
    }

    public int pop() {
        while (mainStack.size() > 1) {//
            helperStack.push(mainStack.pop());
        }
        int val = mainStack.pop();

        while (helperStack.size() > 0) {
            mainStack.push(helperStack.pop());
        }
        return val;
    }

    public int peek() {
        while (mainStack.size() > 1) {//
            helperStack.push(mainStack.pop());
        }
        int val = mainStack.pop();
        helperStack.push(val);

        while (helperStack.size() > 0) {
            mainStack.push(helperStack.pop());
        }
        return val;
    }

    public boolean empty() {
        return mainStack.empty();
    }

    public static void main(String[] args) {
        Question_23 question_23 = new Question_23();
        question_23.push(10);
        question_23.push(20);
        question_23.push(30);
        question_23.push(40);
        question_23.push(50);
        System.out.println(question_23.peek());
        System.out.println(question_23.pop());
        System.out.println(question_23.peek());
        System.out.println(question_23.pop());
    }
}
