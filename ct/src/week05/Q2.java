package week05;

// OX퀴즈
public class Q2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] answer = s.solution(quiz);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int n = 0;
        int m = 0;
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            if (arr[1].equals("+")) {
                n = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
            } else {
                n = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            }
            m = Integer.parseInt(arr[4]);
            answer[i] = n == m ? "O" : "X";
        }
        return answer;
    }
}