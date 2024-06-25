public class odd_or_even {

    public static void oddeven(int n){
        if((n&1)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        oddeven(5);
        oddeven(6);
    }
}
