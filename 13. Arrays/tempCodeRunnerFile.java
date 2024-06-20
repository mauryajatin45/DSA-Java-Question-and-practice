public class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int currmin=0;
        int currmax=0;
        
        for(int i=0; i<=N; i++){
            if(currmin<min){
                min = currmin;
            }
            if(currmax<max){
                max = currmax;
            }
            
        }
        System.out.println(min);
        System.out.println(max);

        int sum = min-max;
        System.out.println("Sum" + sum);
        return sum;
    }
public static void main(String args[]){
    int A[]={2, 4, 1};
    int N=3;
    findSum(A, N);
}

}


