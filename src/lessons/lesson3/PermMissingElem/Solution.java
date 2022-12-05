package lessons.lesson3.PermMissingElem;

public class Solution {

    public int solution(int[] A) {

        int n = A.length;
        boolean[] check = new boolean[n + 2];

        for (int i = 0; i < n; i++) {
            check[A[i]] = true;
        }

        for (int i = 1; i <= n + 1; i++) {
            if (!check[i]) {
                return i;
            }
        }
        return 1;
    }
}
