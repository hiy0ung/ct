package week04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStack stack = new ArrayStack(5);
        while(true) {
            System.out.println("1. push, 2. pop, 3. peek, 4. clear, 5. print, 0. exit");
            int n = sc.nextInt();
            if (n == 0) {
                System.exit(0); // 시스템 자체를 종료
                break;
            }
            int x;
            switch (n) {
                case 1:
                    System.out.println("Push: ");
                    x = sc.nextInt();
                    stack.push(x);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
//                    x = stack.peek();
//                    System.out.println(String.format("%", stack.peek()));
//                    %d(숫자, 오른쪽정렬), %s(문자열, 왼쪽으로 정렬), %f(소수점 이하에 있는 실수를 출력)
                    System.out.println("Peek: " + stack.peek());
                    break;
                case 4:
                    stack.clear();
                    break;
                case 5:
                    stack.print();
                    break;
                default:
                    System.out.println("숫자를 잘못 입력하였습니다.");
                    break;
            }
        }
    }
}

class ArrayStack {
    private int max;
    private int top;
    private int[] stack;

    public ArrayStack(int max) {
        this.max = max;
        this.top = -1; // empty
        this.stack = new int[max];
    }

    public void push(int n) { // top 올라감
        if (top >= max - 1) {
            System.out.println("Stack is Full!!");
        } else {
            stack[++top] = n;
        }
    }

    public void pop() { // top 내려감
        if (top < 0) {
            System.out.println("Stack is Empty!!");
        } else {
            stack[top] = 0;
            --top;
        }
    }

    public int peek() { // top의 위치
        if (top < 0) {
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return stack[top];
    }

    public void clear() {
        this.top = -1;
        this.stack = new int[this.max];
    }

    public void print() {
        System.out.println(Arrays.toString(stack));
    }
}