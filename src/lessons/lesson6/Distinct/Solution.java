package lessons.lesson6.Distinct;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = {2, 1, 1, 2, 3, 1};
        solution.mergeSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public int solution(int[] A) {

        int count = 0;
        int max = Integer.MIN_VALUE;

        mergeSort(A, 0, A.length - 1);

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                count++;
            }
        }

        return count;
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
