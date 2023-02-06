public class Question_6 {
    public static int removeDuplicates(int[] nums) {
        int count =1;
        for (int i=1;i<nums.length;i++){
                if (nums[i]!=nums[i-1]){
                    nums[count++]=nums[i];
                }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

}