public class Question_2 {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        int p = 1;
        while (temp > 0) {
            rev = temp % 10 + rev * 10;
            temp /= 10;
        }

        return rev == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
