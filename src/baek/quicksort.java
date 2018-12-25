package baek;

import java.util.Arrays;

public class quicksort {
    static int[] nums = {5,2,3,1,4,2,3,5,1,7};
    public static void main(String[] args) {

        qsort(0, nums.length-1);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static void qsort(int left, int right) {
        if(left >= right)
            return;

        int pivot = left;
        int i = left;
        int j = right;

        while (i < j) {
            do {
                i++;
            } while (nums[i] < nums[pivot]);

            while (nums[j] > nums[pivot])
                j--;

            if(i >=  j) {
                swap(j, pivot);
                break;
            }
            swap(i, j);
        }
        qsort(left, i-1);
        qsort(j+1, right);
    }

    public static  void swap(int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
