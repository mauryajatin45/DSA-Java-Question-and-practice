public class storing_reverse {
    public static void main(String args[]) {
        int reverse = 0;
        int n = 203020;
        while(n>0){
            int lastdigit= n%10;
            reverse = (reverse*10)+lastdigit;
            n/=10;
        }
        System.out.println(reverse);
    }
}
