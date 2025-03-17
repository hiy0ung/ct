package week03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);

        Scanner sc = new Scanner(System.in);
        // 1 - add, 2 - poll, 3 - peek, 4 - clear, 5 - print, 0 - exit
        while(true) {
            System.out.println("1.add, 2.poll, 3.peek, 4.clear, 5.print, 0.exit");
            int n = sc.nextInt();
            if (n == 0) break;
            int rs = 0;

            switch(n) {
                case 1:
                    int x = sc.nextInt();
                    rs = q.add(x);
                    System.out.println("입력 데이터 : " + rs);
                    break;
                case 2:
                    rs = q.poll();
                    System.out.println("출력(삭제) 데이터 : " + rs);
                    break;
                case 3:
                    rs = q.peek();
                    System.out.println("출력 데이터 : " + rs);
                    break;
                case 4:
                    q.clear();
                    break;
                case 5:
                    q.print();
                    break;
            }
        }
    }
}

// 한 파일에 public 클래스 두 개 만들 수 X
class ArrayQueue {
    private int max; // 최대 용량
    private int front; // 맨 앞 커서
    private int rear; // 맨 뒤 커서
    private int cnt; // 현재 데이터의 수
    private int[] queue; // 큐

    public ArrayQueue(int max) {
        this.max = max;
        this.front = this.rear = this.cnt = 0;
        this.queue = new int[max];
    }

    public int add(int x) { // 큐에 담기
        if (this.cnt >= this.max) {
            System.out.println("Queue is Full!!");
            return -1;
        }
        queue[rear++] = x;
        cnt++;
        if (rear == max) rear = 0;
        return x;
    }

    public int poll() { // 큐에서 하나를 가져오고 삭제
        if (this.cnt <= 0) {
            System.out.println("Queue is Empty!!");
            return -1;
        }
        cnt--;
        if (cnt < 0) cnt = 0;
        if (front == max) front = 0;
        return queue[front++];
    }

    public int peek() { // 큐에서 하나를 가져옴
        if (cnt <= 0) {
            System.out.println("Queue is Empty!!");
            return -1;
        }
        return queue[front];
    }

    public void clear() { // 전체 삭제
        this.front = this.rear = this.cnt = 0;
        queue = new int[this.max];
    }

    public void print() { // 전체 출력
        if (this.cnt <= 0) {
            System.out.println("Queue is Empty!!");
        } else {
            System.out.println(Arrays.toString(queue));
        }
    }
}