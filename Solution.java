public class Solution {
    public static int maxProduct(int nums[]) {
        int maxmul = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            for(int j = i + 1; j<nums.length; j++){
                int product = nums[i] * nums[j];
                if(product>maxmul){
                    maxmul = product;
                }
            }
        }
        return maxmul;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, -2, 4 };
        System.out.println(maxProduct(nums));
    }
}