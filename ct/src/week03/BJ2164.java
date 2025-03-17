package week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2164

public class BJ2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while(q.size() > 1) {
            // 버림
            q.poll();
            // 뽑아서 뒤로 옮김
            q.add(q.poll());
        }
        // 제일 처음 거 뽑기
        System.out.println(q.peek());
    }
}