public class largest_array {

    public static int bignumber(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if(largest<number[i]){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int number[] = { 2, 5, 8, 9, 1, 5 };
        
        System.out.println(bignumber(number));
    }
}
