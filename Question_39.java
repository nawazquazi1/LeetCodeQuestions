public class Question_39 {
    public int[] sortArray(int[] arr) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                temp = arr[j];
                j = j - 1;
            }
            arr[j]=temp;
        }
        return arr;
    }
}
