import java.util.ArrayList;
import java.util.Arrays;

public class Question_31 {
    public static void main(String[] args) {
        System.out.println((Arrays.deepToString(Merge_Overlapping_Intervals(new int[][]{{22, 28}, {1, 8}, {25, 27}, {14, 19}, {27, 30}, {5, 12}}))));

    }
    public static int[][] Merge_Overlapping_Intervals(int[][] time) {
        Arrays.sort(time ,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]>list=new ArrayList<>();
        for (int[] interval:time){
            if (list.size()==0){
                list.add(interval);
            }else {
                int[]per=list.get(list.size()-1);
                if (interval[0]<=per[1]){
                    per[1]=Math.max(per[1],interval[1]);
                }else {
                    list.add(interval);
                }

            }
        }
        return list.toArray(new int[list.size()-1][]);
    }

}
