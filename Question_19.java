import java.util.ArrayList;
import java.util.Arrays;

public class Question_19 {

    public static int[] separateDigits(int[] nums) {
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }
        String[] arr = s.split("");
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        return a;
    }
    public static Object[] separateDigits1(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int j : nums) {
            int num = j;
            while (num != 0) {
                list.add(num % 10);
                num = num / 10;
            }
        }
        return list.toArray();
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(separateDigits1(new int[]{13, 25, 83, 77})));
        System.out.println(Arrays.toString(separateDigits1(new int[]{7,1,3,9})));

    }
}
