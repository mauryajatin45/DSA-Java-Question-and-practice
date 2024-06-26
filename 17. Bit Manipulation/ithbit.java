public class ithbit {

    public static int getithvalue(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithvalue(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearithvalue(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateithvalue(int n, int i, int newbit) {
        if (newbit == 0) {
            return clearithvalue(n, i);
        } else {
            return setithvalue(n, i);
        }
    }

    public static void main(String[] args) {
        System.out.println(updateithvalue(10, 1, 0));
    }
}
