package week05;

import java.util.Arrays;

// 퀵 정렬
public class Ex59 {
    public static void main(String[] args) {
        int arr[] = {6, 4, 8, 3, 2, 5, 1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] array, int l, int r) {
        int left = l;
        int right = r;
        int center = (left + right) / 2;
        do {
            while (array[left] < array[center]) left++;
            while (array[right] > array[center]) right--;

            if (left <= right) {
                swap(array, left++, right--);
            }
        } while (left <= right);

        if (l < right) quickSort(array, l, right);
        if (r < left) quickSort(array, left, r);
    }
    static void swap(int[] array, int n, int m) {
        int tmp = array[n];
        array[n] = array[m];
        array[m] = tmp;
    }
}
