public class zero_and_one {

    public static void pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int add=i+j;
                if(add%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        pyramid(5);
    }
}
