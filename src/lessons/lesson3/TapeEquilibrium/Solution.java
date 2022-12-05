package lessons.lesson3.TapeEquilibrium;

public class Solution {

    public int solution(int[] A) {

        int left = A[0];
        int right = 0;

        for (int i = 1; i < A.length; i++) {
            right += A[i];
        }

        int min = Math.abs(left - right);

        for (int i = 1; i < A.length - 1; i++) {
            left += A[i];
            right -= A[i];
            int diff = Math.abs(left - right);
            if (diff < min) {
                min = diff;
            }
        }

        return min;
    }
}
