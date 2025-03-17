package week02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex24 {
    public static void main(String[] args) {
        // key, value 형태
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동", 90);
        map.put("이몽룡", 100);
        map.put("변학도", 80);
        map.put("홍길동", 99); // 마지막에 업데이트 된 것으로 적용
        System.out.println(map.size()); // size() = 3 (key 값이 같은 것은 중복 X)
        System.out.println(map.get("홍길동")); // 99

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println("이름 : " + key + ", 점수 : " + map.get(key));
        }

        map.remove("홍길동");
        map.clear();
    }
}
