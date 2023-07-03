public class fibonacchiSeries {
    public static int fibo(int n){
        int a =0;
        int b =1;
        int c =0;
        for (int i = 0; i < n; i++) {
            c =  a + b;
             a=b;
             b=c;            
        }
        return c;
        
    }
    public static void main(String[] args) {
        int x = fibo(0);
       System.out.println(x); 
    }
    
}
