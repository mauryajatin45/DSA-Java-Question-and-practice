public class inverted_and_rotated {
    
    public static void pyramid(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            col--;
            System.out.println();
        }

    }

    public static void main(String args[]){
        pyramid(4, 4);
    }
}
