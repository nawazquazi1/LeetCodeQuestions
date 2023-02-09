public class Question_20 {
    public static int differenceOfSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        String s = "";
        for (int num : nums) {
            s += num;
        }
        String[] arr = s.split("");
        int sum2 = 0;
        for (String value : arr) {
            sum2 += Integer.parseInt(value);
        }
        return sum-sum2;
    }

    public static int differenceOfSum1(int[] nums) {
        int esum = 0, dsum = 0;
        for (int i : nums) {
            esum += i;
            for (int j = i; j > 0; j /= 10)
                dsum += (j % 10);
        }
        return (int) Math.abs(dsum - esum);
    }

    public int differenceOfSum2(int[] nums) {
        int totalSum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            totalSum = totalSum + num;
            while (num != 0) {
                digitSum = digitSum + num % 10;
                num = num / 10;
            }
        }
        return Math.abs(totalSum - digitSum);
    }

    public static void main(String[] args) {
        System.out.println(differenceOfSum1(new int[]{1,15,6,3}));
        System.out.println(differenceOfSum1(new int[]{1,2,3,4}));

    }
}
