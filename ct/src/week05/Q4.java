package week05;

// 잘라서 배열 만들기
public class Q4 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();

        String[] answer = sol.solution("abc1Addfggg4556b", 6);
        for (String s : answer) {
            System.out.println(s);
        }
    }
}

class Solution3 {
    public String[] solution(String my_str, int n) {
        int idx = 0;
        if (my_str.length() % n == 0) idx = my_str.length() / n;
        else idx = my_str.length() / n + 1;
        String[] answer = new String[idx];

        for (int i = 0; i < answer.length; i++) {
            int start = i * n;
            int end = 0;
            if (start + n >= my_str.length()) {
                end = my_str.length();
            } else {
                end = start + n;
            }
            // substring(start, end) >> substring은 배열 인덱스와 다르게 0부터 시작 X
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}