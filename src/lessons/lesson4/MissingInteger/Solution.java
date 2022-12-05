package lessons.lesson4.MissingInteger;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                set.add(A[i]);
            }
        }

        for (int i = 1; i <= 1000000; i++) {

            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
