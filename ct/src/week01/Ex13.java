package week01;

public class Ex13 {
    public static void main(String[] args) {
        String s = "Good Morning";

        System.out.println(s.charAt(7));
        System.out.println(s.startsWith("good")); // 대소문자 구분!
        System.out.println(s.endsWith("ng"));
        System.out.println(s.equals("good morning")); // 대소문자 구분!
        System.out.println(s.indexOf("M"));
        System.out.println(s.lastIndexOf("M"));
        System.out.println(s.length());
        System.out.println(s.replace("M", "m"));
        System.out.println(s.replaceAll("Good", "good"));
        System.out.println(s.replaceAll("[Good]", "good")); // 대괄호 안은 정규식 g, o, d 에 해당하는 모든 값을 good로 바꿈
        System.out.println(s.replaceAll("[^Good]", "good")); // ^는 안에 있으면 not의 의미, g, o, d에 해당하지 않는 데이터는 good로 수정
        System.out.println(s.replaceAll("^[Good]", "good")); // g 빼고...?
        System.out.println(s.replaceAll("[Good]$", "good"));
        System.out.println(s.substring(5));
    }
}
