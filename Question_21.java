import java.util.ArrayDeque;
import java.util.Queue;

public class Question_21 {

    Queue<Integer> queue = new ArrayDeque<>();
    Queue<Integer> queue1 = new ArrayDeque<>();

    public Question_21() {
//        Question_21 question_21 = new Question_21();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        while (queue.size() > 1) {
            queue1.add(queue.remove());
        }
        int val = queue.remove();
        while (queue1.size() > 0) {
            queue.add(queue1.remove());
        }

        return val;
    }

    public int top() {
        if (queue.size() == 0) {
            return -1;
        }else {
            while (queue.size()>1){
                queue1.add(queue.remove());
            }
            int val=queue.remove();
            queue1.add(val);
            while (queue1.size()>0){
                queue.add(queue1.remove());
            }
            return val;
        }
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Question_21 question_21 = new Question_21();
        question_21.push(10);
        question_21.push(20);
        question_21.push(30);
        question_21.push(40);
        question_21.push(50);
        System.out.println(question_21.top());
        System.out.println(question_21.pop());
        System.out.println(question_21.top());
    }
}
