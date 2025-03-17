package week02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex23 {
    public static void main(String[] args) {
        /*
        * Set<객체?>
        * 중복 저장 X
        * 인덱스 번호 X -> 순서가 없다는 뜻?
        * 회원가입 할 때 동일한 아이디 중복 되지 않게 하기 위해 자주 사용
        * 인덱스 번호가 있어야 set()이 가능한데 인덱스 번호가 없어서 set() 불가능
        * */
        Set<String> set = new HashSet<>();
        set.add("JAVA");
        set.add("Spring");
        set.add("Oracle");
        set.add("JAVA"); // 중복 불가라서 실제로 저장되는 값은 4개임
        set.add("Mybatis");
        System.out.println(set.size());
        System.out.println(set.toString());
        set.remove("Oracle");

        for (String str : set) {
            System.out.println(str);
        }

        // 반복, set에서 사용 Java util
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
