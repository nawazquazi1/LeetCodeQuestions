public class Question_8 {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (target > nums[i]) {
                index += 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},7));
    }
}
