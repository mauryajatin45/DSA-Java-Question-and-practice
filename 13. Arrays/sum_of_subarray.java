public class sum_of_subarray {

    public static void sumofarray(int number[]) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j<number.length; j++) {
                int currentsum = 0;
                for (int k = i; k < j; k++) {
                    currentsum += number[k];
                }
                // System.out.println("Sum = " + currentsum);    
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, -2, 4};
        sumofarray(number);
    }
}