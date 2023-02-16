import java.util.Arrays;

public class Question_26 {
    public static void main(String[] args) {
        reversArray(new int[]{1, 2, 3, 4, 5});
    }

    public static void reversArray(int[] a) {
        int j = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
