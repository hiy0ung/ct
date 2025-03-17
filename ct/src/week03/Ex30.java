package week03;

import java.util.LinkedList;
import java.util.Queue;

public class Ex30 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); // 메모리가 가득찼을 경우에 에러 뱉음
        q.offer(2); // 메모리가 가득찼을 경우에 false 뱉음
        q.offer(3);
        System.out.println(q.toString()); // [1, 2, 3]
        System.out.println(q.peek()); // 1
        System.out.println(q.poll()); // 1
        System.out.println(q.toString()); // [2, 3] - 1이 poll()로 제거됨
        System.out.println(q.isEmpty()); // false
        System.out.println(q.size()); // 2
        System.out.println(q.remove()); // 2 - poll과 거의 비슷 제일 앞에 있는 거 삭제
        System.out.println(q.toString()); // [3]
        q.clear(); // 전체 제거
        System.out.println(q.toString()); // []
    }
}
