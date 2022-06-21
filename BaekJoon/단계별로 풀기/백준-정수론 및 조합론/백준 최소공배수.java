import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for(int i =0;i<t;i++){
            int gcd = 0;
            st = new StringTokenizer(br.readLine(), " ");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int min = (a>b) ? b:a;
            for(int j = 1;j<=min;j++){
                if(a%j==0 && b%j==0){
                    gcd = j;
                }                
            }
            System.out.println(a*b/gcd);
        }
    }
}