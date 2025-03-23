package week05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        int arr[] = {6, 4, 8, 3, 2, 5, 1};
        Arrays.sort(arr); // 오름차순 정렬
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 수 : ");
        int n = sc.nextInt();

        // binarySearch() : 이진 탐색 해주는 함수
        ///  >>> 비트 연산자...?
        int idx = Arrays.binarySearch(arr, n);
        if (idx < 0) { // 값이 없는 것??
            System.out.println("존재하지 않는 수 " + n);
        } else {
            System.out.println(String.format("%d는 arr[%d]존재", n, idx));
        }
    }
}
