package week05;

import java.util.Arrays;

// 단순선택정렬
public class Ex57 {
    public static void main(String[] args) {
        int arr[] = {6, 4, 8, 3, 2, 5, 1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i; // 최소값의 배열 번호
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }

    static void swap(int[] array, int n, int m) {
        int tmp = array[n];
        array[n] = array[m];
        array[m] = tmp;
    }
}
