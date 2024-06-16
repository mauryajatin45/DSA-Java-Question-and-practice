public class inverted_half_pyramid{

    public static void pyramid(int row){

        for(int i=row; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            row--;
            System.out.println();
        }
    }

    public static void main(String args[]){
        pyramid(5);
    }
}