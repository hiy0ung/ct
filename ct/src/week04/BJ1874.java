package week04;

// https://www.acmicpc.net/problem/1874

import java.util.Scanner;
import java.util.Stack;

public class BJ1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 중간에 값 집어넣기, 빼기 가능...? (+ StringBuffer)
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        int top = 0;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m > top) {
                for (int j = top + 1; j <= m; j++) {
                    stack.push(j);
                    sb.append("+").append("\n"); //sb.append("+\n); 과 같음
                }
                top = m;
            } else if (stack.peek() != m) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n"); // sb.append("-\n");
        }
        System.out.println(sb.toString());
    }
}
