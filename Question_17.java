public class Question_17 {

    public static boolean isPalindrome(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ans += Character.toLowerCase(s.charAt(i));
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                ans += s.charAt(i);
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ans += s.charAt(i);
            }
        }
        String ans2 = "";
        for (int i = 0; i < ans.length(); i++) {
            ans2 = ans.charAt(i) + ans2;
        }
        return ans.equals(ans2);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
