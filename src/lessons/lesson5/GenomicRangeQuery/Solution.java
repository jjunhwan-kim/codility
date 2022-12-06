package lessons.lesson5.GenomicRangeQuery;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
        for (int answer : result) {
            System.out.print(answer + " ");
        }
        System.out.println();
    }

    public int[] solution(String S, int[] P, int[] Q) {

        // A 1
        // C 2
        // G 3
        // T 4

        int[] sumA = new int[S.length()];
        int[] sumC = new int[S.length()];
        int[] sumG = new int[S.length()];
        int[] sumT = new int[S.length()];

        if (S.charAt(0) == 'A') {
            sumA[0] = 1;
            sumC[0] = 0;
            sumG[0] = 0;
            sumT[0] = 0;
        } else if (S.charAt(0) == 'C') {
            sumA[0] = 0;
            sumC[0] = 1;
            sumG[0] = 0;
            sumT[0] = 0;
        } else if (S.charAt(0) == 'G') {
            sumA[0] = 0;
            sumC[0] = 0;
            sumG[0] = 1;
            sumT[0] = 0;
        } else {
            sumA[0] = 0;
            sumC[0] = 0;
            sumG[0] = 0;
            sumT[0] = 1;
        }

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == 'A') {
                sumA[i] = sumA[i - 1] + 1;
                sumC[i] = sumC[i - 1];
                sumG[i] = sumG[i - 1];
                sumT[i] = sumT[i - 1];
            } else if (S.charAt(i) == 'C') {
                sumA[i] = sumA[i - 1];
                sumC[i] = sumC[i - 1] + 1;
                sumG[i] = sumG[i - 1];
                sumT[i] = sumT[i - 1];
            } else if (S.charAt(i) == 'G') {
                sumA[i] = sumA[i - 1];
                sumC[i] = sumC[i - 1];
                sumG[i] = sumG[i - 1] + 1;
                sumT[i] = sumT[i - 1];
            } else {
                sumA[i] = sumA[i - 1];
                sumC[i] = sumC[i - 1];
                sumG[i] = sumG[i - 1];
                sumT[i] = sumT[i - 1] + 1;
            }
        }

        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int start = P[i];
            int end = Q[i];

            if (start == 0) {
                if (sumA[end] > 0) result[i] = 1;
                else if (sumC[end] > 0) result[i] = 2;
                else if (sumG[end] > 0) result[i] = 3;
                else if (sumT[end] > 0) result[i] = 4;
            } else {
                int _sumA = sumA[end] - sumA[start - 1];
                int _sumC = sumC[end] - sumC[start - 1];
                int _sumG = sumG[end] - sumG[start - 1];
                int _sumT = sumT[end] - sumT[start - 1];

                if (_sumA > 0) result[i] = 1;
                else if (_sumC > 0) result[i] = 2;
                else if (_sumG > 0) result[i] = 3;
                else if (_sumT > 0) result[i] = 4;
            }
        }

        return result;
    }
}
