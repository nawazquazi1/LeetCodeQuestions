import java.util.Stack;

public class Question_28 {

    public static void main(String[] args) {

    }

    public static void Celebrity_Problem(int[][] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }
        while (stack.size() >= 2) {
            int i = stack.pop();
            int j = stack.pop();
            if (arr[i][j] == 1) {
                stack.push(i);
            } else {
                stack.push(j);
            }
        }
        int pot = stack.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i != pot) {
                if (arr[i][pot] == 0 || arr[pot][i] == 0) {
                    System.out.println("none");
                    return;
                }
            }
        }
        System.out.println(pot);
    }
}
