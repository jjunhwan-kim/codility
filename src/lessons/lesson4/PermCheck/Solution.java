package lessons.lesson4.PermCheck;

public class Solution {

    public int solution(int[] A) {

        int n = 100000;
        boolean[] check = new boolean[n + 1];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > n) {
                return 0;
            }
            check[A[i]] = true;
        }

        for (int i = 1; i <= A.length; i++) {
            if (!check[i]) {
                return 0;
            }
        }

        return 1;
    }
}
