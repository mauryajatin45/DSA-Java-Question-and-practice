import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.*;

public class Solution {
    public static long reverse(long x) {
        long number = 0;
        while (x != 0) {
            long last = x % 10;
            number =number * 10 + last;
            x /= 10;
        }
        return number;
    }

    public static void main(String[] args) {
        long x = 1534236469;
        reverse(x);
        System.out.println(reverse(x));
    }
}