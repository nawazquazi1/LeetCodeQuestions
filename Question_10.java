import java.util.Arrays;

public class Question_10 {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] <= 8){
                digits[i] = digits[i] + 1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] ans = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9999})));
    }
}
