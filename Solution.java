import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = mergeArraysUsingStreams(nums1, nums2);
        Arrays.sort(arr);
        int add = 0;
        for (int i; i < arr.length; i++) {
            add += arr[i];
        }
        double op;
        return op = add / arr.length;

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3 };
        int nums2[] = { 2, 4 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}