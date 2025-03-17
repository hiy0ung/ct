package week03;

import java.util.Deque;
import java.util.LinkedList;

public class Ex31 {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.toString()); // [1, 2, 3, 4]
        q.addFirst(0); // 맨 앞에 추가
        System.out.println(q.toString()); // [0, 1, 2, 3, 4]
        q.addLast(0); // 맨 뒤에 추가 (그냥 add() 써도 됨)
        System.out.println(q.toString()); // [0, 1, 2, 3, 4, 0]
    }
}
