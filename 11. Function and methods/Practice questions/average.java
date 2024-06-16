
public class average {
    public static int avg(int fvalue, int svalue, int tvalue) {
        int averag = (fvalue + svalue + tvalue) / 3;
        return averag;
    }
    
    public static void main(String args[]) {
        
        System.out.println("Average  = " +  avg(3, 4, 5));
        
    }
}