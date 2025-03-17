package week03;

import java.util.Deque;

import java.util.LinkedList;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1021

public class BJ1021 {
    public static void main(String[] args) {
        // deque는 index가 없음, 대체로 LinkedList 쓸 수 있음
        LinkedList<Integer> deque = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N - 총 큐
        int m = sc.nextInt(); // 뽑을 개수
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        int[] arr = new int[m];

        for (int i = 0; i <  m; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 0; // 회전 수

        for (int a : arr) {
            int idx = deque.indexOf(a);
            int half = deque.size() / 2;

            if (idx < half) {
                while (a != deque.getFirst()) {
                    deque.addLast(deque.removeFirst()); // add() 가능
                    k++;
                }
            } else {
                while (a != deque.getFirst()) {
                    deque.addFirst(deque.removeLast());
                    k++;
                }
            }
            deque.pollFirst(); // poll() 가능
        }
        System.out.println(k);
    }
}