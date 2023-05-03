import java.util.Stack;

public class Question_35 {
    Stack<Integer> allData;
    Stack<Integer> minData;
    int min=Integer.MAX_VALUE;

    Question_35() {
        allData = new Stack<>();
        minData = new Stack<>();
    }

    public void push(int val) {
//        allData.push(val);
//        if (minData.size() == 0 || val <= minData.peek()) {
//            minData.push(val);
//        }
        if (val<=min){
            allData.push(min);
            min=val;
        }
        allData.push(val);
    }

    public void pop() {
//        int val = allData.pop();
//        if (val == minData.peek()) {
//            minData.pop();
//        }
        if (allData.pop()==min){
            min=allData.pop();
        }
    }

    public int top() {
        return allData.peek();
    }

    public int getMin() {
        return min;
    }

    public int size(){
        return allData.size();
    }

    public static void main(String[] args) {
        Question_35  minStack=new Question_35();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.size());

    }
}
