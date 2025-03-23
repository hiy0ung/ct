package week05;

import java.util.Scanner;

// 선형 검색 (순차 검색)
public class Ex53 {
    public static void main(String[] args) {
        int arr[] = {6, 4, 8, 3, 2, 5, 1};
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 수 : ");
        int n = sc.nextInt();
        int idx = SequenceSearch.sequenceSearch(arr, n);
        if (idx == -1) {
            System.out.println("존재하지 않는 수 " + n);
        } else {
            System.out.println(String.format("%d는 arr[%d]존재", n, idx)); //입력한 수(n)은 arr[idx] 에 존재
        }
    }
}

class SequenceSearch {
    static int sequenceSearch(int[] array, int key) { // static을 붙이면 메모리에 올라감 > 객체 생성 안 하고 바로 사용 가능
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }
}
