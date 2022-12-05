package lessons.lesson3.FrogJmp;

public class Solution {

    public int solution(int X, int Y, int D) {

        int distance = Y - X;
        if (distance % D == 0) {
            return distance / D;
        }
        return distance / D + 1;
    }
}
