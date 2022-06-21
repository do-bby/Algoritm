import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        for(int i = 0; i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());            
        }
        Arrays.sort(arr);
        int gcd = arr[1] - arr[0];
        for(int i =2;i<n;i++){
            gcd = GCD(gcd, arr[i]-arr[i-1]);
        }
        for(int i = 2;i<=gcd;i++){
            if(gcd%i==0){
                System.out.print(i + " ");
            }
        }
        
    }
    private static int GCD(int a, int b){
        while(b !=0){
            int r = a%b;
            
            a=b;
            b=r;            
        }
        return a;
    }
}