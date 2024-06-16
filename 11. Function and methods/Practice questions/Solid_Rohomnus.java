public class Solid_Rohomnus {

    public static void rhombus(int n) {

        for (int i = 1; i <=n; i++) {
            for(int j = n; j>=i; j--){
                System.out.print(" ");
            }
            for (int star = 1; star <= n; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        rhombus(5);
    }
}
