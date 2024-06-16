public class decimal_to_binary {

    public static int dectobin(int n) {
        int bin = 0;
        int rem;
        int pow = 0;
        while (n > 0) {
            rem = n % 2;
            bin += rem * Math.pow(10, pow);
            pow++;
            n /= 2;
        }
        return bin;
    }

    public static void main(String args[]) {
        System.out.print(dectobin(5));
    }
}
