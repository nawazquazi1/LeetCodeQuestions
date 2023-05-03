import java.util.Arrays;

public class Question_38 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertion_sort(new int[]{5, 8, 3, 2, 10, 34, 67, 24,})));
    }




    public static int[] insertion_sort(int[] arr) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
        return arr;
    }

    public static int[] Selection_sort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }


    public static int[] bubbleSort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag++;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        return arr;
    }
}
class mergeSort{
    int[] arr;
    int[] TempMergeArr;
    int length;

    public void sort(int[] arr) {
        this.arr = arr;
        this.length = arr.length;
        this.TempMergeArr = new int[length];
        divide(0, length - 1);
    }

    public void divide(int lower, int higher) {
        if (lower < higher) {
            int middle = lower + (higher - lower) / 2;
//            it will sort left side of an array
            divide(lower, middle);
//            it will sort the right side of an array
            divide(middle + 1, higher);
            merge_array(lower, middle, higher);
        }
    }

    public void merge_array(int lower, int middle, int higher) {
        for (int i = lower; i <= higher; i++) {
            TempMergeArr[i] = arr[i];
        }
        int i = lower;
        int j = middle + 1;
        int k = lower;
        while (i <= middle && j <= higher) {
            if (TempMergeArr[i] <= TempMergeArr[j]) {
                arr[k] = TempMergeArr[i];
                i++;
            } else {
                arr[k] = TempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = TempMergeArr[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        mergeSort mergeSort=new mergeSort();
        int[]arr={48,36,13,52,19,94,21};
        mergeSort.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}