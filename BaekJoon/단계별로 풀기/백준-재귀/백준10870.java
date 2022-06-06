import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int fibo = fibo(n);
        System.out.print(fibo);
    }
    public static int fibo(int n){
        if(n == 0) return 0;
        else if(n==1) return 1;
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }
    
}