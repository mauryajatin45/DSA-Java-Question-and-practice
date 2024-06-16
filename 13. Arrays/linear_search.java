public class linear_search {

    public static int search(int even[], int key) {
        for (int i = 0; i < even.length; i++) {
            if (even[i] == key) {
                return even[i];
            }else{
                return -1;
            }
        }
        
    }

    public static void main(String args[]) {
        int even[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 12;
        int index = search(even, key);
        if (index == -1) {
            System.out.println("Not found! try again");
        } else {
            System.out.println("The match fond at key : " + index);
        }
    }
}
