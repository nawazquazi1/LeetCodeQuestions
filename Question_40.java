import java.util.ArrayList;
import java.util.HashSet;

public class Question_40 {
    public static void main(String[] args) {
//        Find_kth_Largest_and_Smallest_Element(new int[]{6, 8, 2, 4, 3, 1, 5, 7, 9});
//        System.out.println(ArmstrongNumber(121));
//        find_first_duplicate_element(new int[]{6, 5, 3, 2, 5, 4,1, 2, 4,6});
//        Maximum_sum_SubArray(new int[]{1,2,3,-2,5});
        How_to_find_common_elements_from_Two_arrays(
                new int[]{1, 5, 10, 20, 40, 80},new int[]{6, 7, 20, 80, 100},new int[]{3, 4, 15, 20, 30, 70, 80, 12}
        );
    }

    public static void How_to_find_common_elements_from_Two_arrays(int[] arr1, int[] arr2, int[] arr3) {
        int x = 0, y = 0, z = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while (x < arr1.length && y < arr2.length && z < arr3.length) {
            if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
                al.add(arr1[x]);
                x++;
                y++;
                z++;
            } else if (arr1[x] < arr2[y]) {
                x++;
            } else if (arr2[y] < arr3[z]) {
                y++;
            } else {
                z++;
            }
        }
        for (int no : al) {
            System.out.println(no);
        }
    }

    public static void Maximum_sum_SubArray(int[] arr) {
        int min = Integer.MIN_VALUE;
        int Max_ending = 0;
        int s = 0, start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            Max_ending += arr[i];
            if (min < Max_ending) {
                min = Max_ending;
                start = s;
                end = i;
            }
            if (Max_ending < 0) {
                Max_ending = 0;
                s = i + 1;
            }
        }
        System.out.println(min);
        System.out.println("Starting index position " + start);
        System.out.println("ending index position " + end);
    }
    public static void find_first_duplicate_element(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int temp = -1;
        for (int i = arr.length-1;i>=0;i--) {
            if (set.contains(arr[i])) {
                temp = i;
//                break;
            } else {
                set.add(arr[i]);
            }
        }
        if (temp != -1) {
            System.out.println(arr[temp]);
        }
    }

    public static void Find_kth_Largest_and_Smallest_Element(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int Second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                Second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > Second_largest && arr[i] != largest) {
                Second_largest = arr[i];
            }
        }

        if (Second_largest == Integer.MIN_VALUE) {
            System.out.println("There is a no second largest element ");
        } else {
            System.out.println(Second_largest);
        }

    }

    public static int ArmstrongNumber(int n) {
        int temp = n;
        int count = 0;
        int rev = 0;
        while (temp != 0) {
            temp /= 10;

            count++;
        }
        int rem;
        while (n != 0) {
            rem = n % 10;
            rev += (int) Math.pow(rem, count);
            n /= 10;
        }
        return rev;
    }

}
