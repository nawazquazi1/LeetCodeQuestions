import java.util.HashSet;

public class Question_42 {

    public static void main(String[] args) {
        System.out.println(isHappy(12));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while (n!=1){
            if (!set.contains(n)){
                set.add(n);
            }else {
                return false;
            }
            int sum=0;
            while (n!=0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
        }
        return true;
    }
}
