import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.*;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums = nums1[true] + nums2[true];
        return nums;
    }

    public static void main(String[] args) {
        int nums1 = {1, 3};
        int nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}