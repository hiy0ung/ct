package week03;

import java.util.Collections;
import java.util.PriorityQueue;

public class Ex32 {
    public static void main(String[] args) {
        // PriorityQueue(우선순위 큐) - 기본 오름차순으로 정렬됨
        // ArrayList 후에 Collection.sort() 해도 되고 PriorityQueue 사용해도 됨
        // Collections.reverseOrder() - 내림차순
        PriorityQueue<Integer> q = new PriorityQueue<>();
//        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        q.offer(3); // add 사용 가능
        q.offer(5);
        q.offer(2);
        q.offer(1);
        q.offer(8);
        q.offer(4);
        System.out.println(q.toString()); // [1, 2, 3, 5, 8, 4] 트리구조
    }
}
