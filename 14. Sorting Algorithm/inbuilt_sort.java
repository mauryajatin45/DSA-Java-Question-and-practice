
// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {
    public static void main(String[] args) {
        // int nums[] = { 1, 2, 5, 6, 4 };
        // Arrays.sort(nums);
        // System.out.println("This is sorted array: ");
        Integer nums[] = { 1, 2, 5, 6, 4 };
        System.out.println("This is an sorted reverse arrays");
        Arrays.sort(nums, Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        Integer arr[] = { 1, 2, 5, 6, 4 };
        System.out.println("This is an sorted reverse arrays from an Starting index to an ending index");
        Arrays.sort(arr, 0, 2, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
