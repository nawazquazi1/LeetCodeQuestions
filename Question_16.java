import java.util.ArrayList;
import java.util.Arrays;

public class Question_16 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, i = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int []arr=new int[m+n];
        for (int i=0;i<Math.max(nums1.length,nums2.length);i++){
            if (nums1[i]<nums2[i]){
                arr[i]=nums1[i];
                nums1[i]=-1;
            }
        }
        if (nums1.length>0){
            arr=nums1;
        }
        if (nums2.length>0){
            arr=nums2;
        }

        System.out.println(Arrays.toString(arr));


    }


    //[1, 2, 3, 2, 5, 6]
    public static void main(String[] args) {
        merge1(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);


    }
}
