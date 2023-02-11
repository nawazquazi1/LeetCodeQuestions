import java.util.Arrays;

public class Question_25 {

    public static boolean isAnagram1(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int alphabet[] = new int[26];

        for(int i=0; i<s.length(); i++){
            alphabet[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }
        for(int i: alphabet) {
            if(i != 0) {
                return false;
            }
        }
        System.out.println(Arrays.toString(alphabet));
        return true;
    }

    static {
         System.out.println("Welcome to DurgaSoftware Soultions");
         System.exit(0);//To terminate the programme
         }

//    public static void main(String[] args) {
//        System.out.println(isAnagram1("anagram", "nagaqam"));
//        System.out.println(isAnagram1("rat", "car"));
//        System.out.println(isAnagram1("a", "b"));
//        System.out.println(isAnagram1("akib", "bika"));
//        System.out.println(isAnagram1("wazan", "nawaz"));
//        System.out.println(isAnagram1("quazi", "quiz"));

//    }
}
