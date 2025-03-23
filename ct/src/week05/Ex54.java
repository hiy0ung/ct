package week05;

import java.util.Arrays;
import java.util.Scanner;

// 이진 검색
public class Ex54 {
    public static void main(String[] args) {
        int arr[] = {6, 4, 8, 3, 2, 5, 1};
        Arrays.sort(arr); // 오름차순 정렬
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 수 : ");
        int n = sc.nextInt();
        BinSearch bs = new BinSearch(); // binSearch()에 static 안 썼기 때문에 객체를 생성
        int idx = bs.binSearch(arr, n);
        if (idx == -1) {
            System.out.println("존재하지 않는 수 " + n);
        } else {
            System.out.println(String.format("%d는 arr[%d]존재", n, idx)); //입력한 수(n)은 arr[idx] 에 존재
        }
    }
}

class BinSearch {
    int binSearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        // do-while은 조건이 맞든 안 맞든 일단 한 번 실행
        // while은 조건이 안 맞으면 실행 X
        do {
            int center = (left + right) / 2;
            if (array[center] == key) return center;
            else if (array[center] < key) {
                left = center + 1;
            } else {
                right = center - 1;
            }
        } while (left <= right);
        return -1;
    }
}
