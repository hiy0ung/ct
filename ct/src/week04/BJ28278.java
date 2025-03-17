package week04;

// https://www.acmicpc.net/problem/28278

import java.util.Scanner;
import java.util.Stack;

public class BJ28278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");

            switch (arr[0]) {
                case "1":
                    stack.push(Integer.parseInt(arr[1]));
                    break;
                case "2":
                    System.out.println(stack.isEmpty() ? -1 : stack.pop());
                    break;
                case "3":
                    System.out.println(stack.size());
                    break;
                case "4":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "5":
                    System.out.println(stack.isEmpty() ? -1 : stack.peek());
                    break;
            }
        }
    }
}
