package lessons.lesson1.BinaryGap;

public class Solution {

    // 2 | 10
    //     5   0
    //     2   1
    //     1   0
    //     0   1
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(1041));
    }

    public int solution(int N) {

        String binary = convertToBinary(N);
        return calculateBinaryGap(binary);
    }

    private String convertToBinary(int n) {

        StringBuilder sb = new StringBuilder();

        int q = n / 2;
        int r = n % 2;

        if (q > 0) {
            sb.append(convertToBinary(q));
        }
        sb.append(r);

        return sb.toString();
    }

    private int calculateBinaryGap(String binary) {

        boolean found = false;
        int count = 0;
        int max = 0;

        for (int i = 1; i < binary.length(); i++) {

            if (!found && binary.charAt(i) == '0' && binary.charAt(i - 1) == '1') {
                found = true;
                count = 1;
            } else if (binary.charAt(i) == '0') {
                count++;
            } else if (binary.charAt(i) == '1') {
                found = false;
                if (count > max) {
                    max = count;
                }
            }
        }

        return max;
    }
}
