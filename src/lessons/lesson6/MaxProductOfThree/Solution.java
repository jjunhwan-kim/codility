package lessons.lesson6.MaxProductOfThree;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{5, 4, 3, 1, 2};

        System.out.println(solution.solution(arr));
    }

    public int solution(int[] A) {

        mergeSort(A, 0, A.length - 1);


        int a = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int b = A[A.length - 1] * A[0] * A[1];


        return a > b ? a : b;
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
