package lessons.lesson5.MinAvgTwoSlice;

public class Solution {

    public int solution(int[] A) {

        int index = 0;
        double min = Double.MAX_VALUE;
        double avg;

        for (int i = 0; i < A.length - 2; i++) {
            avg = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            if (avg < min) {
                min = avg;
                index = i;
            }

            avg = (A[i] + A[i + 1]) / 2.0;
            if (avg < min) {
                min = avg;
                index = i;
            }
        }

        avg = (A[A.length - 2] + A[A.length - 1]) / 2.0;
        if (avg < min) {
            min = avg;
            index = A.length - 2;
        }

        return index;
    }
}
