package lessons.lesson5.PassingCars;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[] {0, 1, 0, 1, 1}));
    }

    public int solution(int[] A) {

        int count = 0;
        int result = 0;
        for (int i = A.length - 1; i >= 0; i--) {

            if (A[i] == 1) {
                count++;
            } else {
                result += count;
                if (result > 1000000000) {
                    return -1;
                }
            }

        }

        return result;
    }

}
