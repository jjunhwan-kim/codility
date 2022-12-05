package lessons.lesson4.FrogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int X, int[] A) {

        // 1 ~ X => leaves need to be exist
        // K = time
        // A[K] = position

        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i <A.length; i++) {

            if (!set.contains(A[i])) {
                set.add(A[i]);
                count++;
            }

            if (count == X) {
                return i;
            }

        }

        return -1;
    }
}
