package week02;

import java.util.ArrayList;
import java.util.List;

public class Ex20 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("JAVA");
        list.add("Spring");
        list.add("Mybatis");
        list.add(2, "Oracle");

        System.out.println(list.size());
        System.out.println(list.get(2));
        list.set(3, "iBatis");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(0);
        list.remove("iBatis");
        list.clear();
    }
}
