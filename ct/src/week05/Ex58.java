package week05;

import java.util.Arrays;

// 삽입 정렬
public class Ex58 {
    public static void main(String[] args) {
        int arr[] = {6, 4, 8, 3, 2, 5, 1};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j;
            int tmp = array[i];
            for (j = i; j > 0 && array[j - 1] > tmp; j--) {
                array[j] = array[j - 1];
            }
            array[j] = tmp;
        }
    }
}
