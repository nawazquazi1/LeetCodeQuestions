import java.util.Arrays;

public class Question_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        outerLoop:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break outerLoop;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

    }
}
