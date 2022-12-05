package lessons.lesson4.MaxCounters;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        for (int answer : result) {
            System.out.print(answer + " ");
        }
        System.out.println();
    }

    public int[] solution(int N, int[] A) {

        int[] result = new int[N];
        int max = 0;
        int offset = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                offset = max;
            } else {

                int index = A[i] - 1;

                if (result[index] < offset) {
                    result[index] = offset;
                }

                result[index]++;
                if (result[index] > max) {
                    max = result[index];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (result[i] < offset) {
                result[i] = offset;
            }
        }

        return result;
    }
}
