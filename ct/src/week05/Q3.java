package week05;

// 7의배수
public class Q3 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] array = {10, 29};
        System.out.println(sol.solution(array));
    }
}

class Solution2 {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String[] arr = String.valueOf(array[i]).split("");
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}