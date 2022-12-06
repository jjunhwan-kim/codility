package lessons.lesson5.CountDiv;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution(6, 11, 2));
    }

    public int solution(int A, int B, int K) {

        int a = A / K;
        int b = B / K;

        int result = b - a;
        if (A % K == 0) {
            result++;
        }

        return result;
    }
}
