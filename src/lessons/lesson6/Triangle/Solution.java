package lessons.lesson6.Triangle;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[] {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE}));
    }

    public int solution(int[] A) {

        mergeSort(A, 0, A.length - 1);

        for (int i = 0; i < A.length - 2; i++) {
            if (((long)A[i] + A[i + 1] > A[i + 2]) &&
                    ((long)A[i] + A[i + 2] > A[i + 1]) &&
                    ((long)A[i + 1] + A[i + 2] > A[i])) {
                return 1;
            }
        }

        return 0;
    }

    public void mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, right);
        }
    }

    public void merge(int[] arr, int left, int right) {

        int mid = (left + right) / 2;
        int leftIndex = left;
        int rightIndex = mid + 1;
        int index = 0;
        int[] temp = new int[right - left + 1];

        while (leftIndex <= mid && rightIndex <= right) {
            if (arr[leftIndex] < arr[rightIndex]) {
                temp[index++] = arr[leftIndex++];
            } else {
                temp[index++] = arr[rightIndex++];
            }
        }

        while (leftIndex <= mid) {
            temp[index++] = arr[leftIndex++];
        }

        while (rightIndex <= right) {
            temp[index++] = arr[rightIndex++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }
    }
}
