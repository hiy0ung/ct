package week03;

import java.util.LinkedList;

import java.util.Queue;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2161

// ctrl + shift + o > 전체 import? - eclipse

public class BJ2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (q.size() > 1) {
            // 1 버린다
            System.out.print(q.poll() + " ");
            // 2 뽑아서 맨 뒤에 넣는다
            q.add(q.poll());
        }
        System.out.println(q.peek()); // q.poll() 해도 됨
    }
}