public class Question_12 {
    public static int mySqrt(int x) {
        int i = (int) Math.sqrt(x);
        return i;
    }

    public static int mySqrt1(int x) {
         int ans = 0;
         for(int i =1; i<=x;i++){
           if(i*i>x){
           ans=i-1;
           break;
           }
           if(i*i==x){
           ans=i;
           break;
           }
         }
         return ans;
     }

    public static void main(String[] args) {
        System.out.println(mySqrt1(2147483647));
        System.out.println(mySqrt1(8));

    }
}
