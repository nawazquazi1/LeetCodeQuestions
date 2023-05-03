import java.util.ArrayList;
import java.util.List;

public class Question_36 {

    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{1,3},3));
    }
    public static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (count == target.length) {
                break;
            }
            list.add("Push");
            if (target[count++] != i) {
                list.add("Pop");
                count--;
            }
        }
        return list;
    }
}
