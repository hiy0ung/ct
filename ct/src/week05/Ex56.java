package week05;

import java.util.Arrays;

// 버블 정렬
public class Ex56 {
    public static void main(String[] args) {
        int arr[] = {6, 4, 8, 3, 2, 5, 1};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // main 메소드가 static인데 static을 안 붙여주면 안 됨 (메모리에 올라간 메서드가 안 올라간 메서드를 호출할 수 X)
    static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) { // 교환
                    swap(array, i, j);
                }
            }
        }
    }

    // 위치 바꾸는 메서드
    // static으로 만들어줘야함
    static void swap(int array[], int n, int m) {
        int tmp = array[n];
        array[n] = array[m];
        array[m] = tmp;
    }
}
