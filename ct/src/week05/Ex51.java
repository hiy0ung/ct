package week05;

import java.util.TreeSet;

public class Ex51 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);
        System.out.println(scores.toString());

        Integer score = null; // Integer은 객체이기 떄문에 null
        score = scores.first();
        System.out.println("낮은 점수 : " + score);

        score = scores.last();
        System.out.println("높은 점수 : " + score);

        score = scores.lower(95);
        System.out.println("아래 점수 : " + score);

        score = scores.higher(95);
        System.out.println("위 점수 : " + score);
    }
}
