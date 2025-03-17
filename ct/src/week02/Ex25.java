package week02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("spring", "1234");
        map.put("summer", "12345");
        map.put("fall", "123");
        map.put("winter", "123456");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("아이디와 비밀번호를 입력하세요!!");
            System.out.print("아이디 : ");
            String id = sc.nextLine();
            System.out.print("비밀번호 : ");
            String pswd = sc.nextLine();
            if (map.containsKey(id)) { // 존재할 때
                if (map.get(id).equals(pswd)) {
                    System.out.println("로그인 성공");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않음");
                }
            } else { // 존재하지 않을 때
                System.out.println("아이디가 존재하지 않음");
            }
        }
    }
}
