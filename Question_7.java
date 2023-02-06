import java.util.ArrayList;
import java.util.Arrays;

public class Question_7 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++]=nums[i];
                list.add(nums[i]);

            }
        }
        System.out.println(list);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }
}
