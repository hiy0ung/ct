package week04;

// https://www.acmicpc.net/problem/10828

import java.util.Scanner;
import java.util.Stack;

public class BJ10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();

        // int 타입을 받고 바로 String 타입을 받으려고 하면 오류
        // String 타입을 받겠다고 미리 알려주는 것?
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            switch (arr[0]) {
                case "push":
                    stack.push(Integer.parseInt(arr[1]));
                    break;
                case "pop":
                    // isEmpty() 대신 empty() 사용 가능 (stack에 있는 메소드)
                    // if (stack.isEmpty()) System.out.println(-1);
                    // else System.out.println(stack.pop());
                    System.out.println(stack.isEmpty() ? -1 : stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    // if (stack.isEmpty()) System.out.println(1);
                    // else System.out.println(0);
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    // if (stack.isEmpty()) System.out.println(-1);
                    // else System.out.println(stack.peek());
                    System.out.println(stack.isEmpty() ? -1 : stack.peek());
                    break;
                default:
                    break;
            }
        }
    }
}
