package week05;

// 다음에 올 숫자
public class Q5 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        int[] common = {2, 4, 8};
        System.out.println(sol.solution(common));
    }
}

class Solution4 {
    public int solution(int[] common) {
        // 1, 2의 차와 2, 3의 차, 3, 4의 차가 같으면 마지막 거에 차 더하기 (등차수열)
        // 1, 2의 나눗셈 몫과, 2, 3의 나눗셈 몫이 같으면 마지막 거에 몫 곱하기 (등비수열)
        int answer = 0;
        int end = common[common.length - 1];
        if (common[1] - common[0] == common[2] - common[1]) answer = end + (common[1] - common[0]);
        else answer = end * (common[1] / common[0]);
        return answer;
    }
}