import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Question_18 {
    public static int singleNumber(int[] nums) {
        int ans=0; //since XOR with 0 returns same number
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i)
        }
        return ans;
    }

    public static int singleNumber1(int[] nums) {
        int i=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for( i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                int n=list.indexOf(nums[i]);
                list.remove(n);
            }else if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return  list.get(0);
    }
    public static int singleNumber2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber2(new int[]{2, 2, 1}));
        System.out.println(singleNumber2(new int[]{4 ,1, 2,1,2}));
    }
}
