package week05;

import java.util.Map;
import java.util.TreeMap;

public class Ex52 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "홍길동1");
        scores.put(98, "홍길동2");
        scores.put(75, "홍길동3");
        scores.put(95, "홍길동4");
        scores.put(90, "홍길동5");

        Map.Entry<Integer, String> entry = null;
        entry = scores.firstEntry();
        System.out.println(String.format("가장 낮은 점수 : %d - %s", entry.getKey(), entry.getValue())); // %d - 키, %s - 값

        entry = scores.lastEntry();
        System.out.println(String.format("가장 높은 점수 : %d - %s", entry.getKey(), entry.getValue()));

        entry = scores.lowerEntry(88);
        System.out.println(String.format("아래 점수 : %d - %s", entry.getKey(), entry.getValue()));

        entry = scores.higherEntry(88);
        System.out.println(String.format(" 점수 : %d - %s", entry.getKey(), entry.getValue()));

    }
}
