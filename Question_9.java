import java.util.Arrays;

public class Question_9 {
    public  static int lengthOfLastWord(String s) {
        String[] sa = s.split(" ");
        return sa[sa.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
