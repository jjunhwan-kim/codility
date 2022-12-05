package lessons.lesson2.OddOccurrencesInArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[] {2,2,3,3,4}));
    }

    public int solution(int[] A) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            Integer count = Optional.ofNullable(map.get(A[i])).orElse(0);
            map.put(A[i], count + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
