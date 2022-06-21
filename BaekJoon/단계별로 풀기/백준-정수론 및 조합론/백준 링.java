import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int first = Integer.parseInt(st.nextToken());
        
        for(int i = 1; i<n;i++){            
            int other = Integer.parseInt(st.nextToken());            
            int gcd = GCD(first,other);
            System.out.println((first/gcd) + "/" + (other/gcd));
        }                        
    }
    private static int GCD(int a, int b){
        while(b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}