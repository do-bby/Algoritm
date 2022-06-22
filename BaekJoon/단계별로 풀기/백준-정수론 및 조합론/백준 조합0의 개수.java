import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        
        long five = fp(n)-fp(n-m)-fp(m);
        long two = tp(n)-tp(n-m)-tp(m);
        
        System.out.println(Math.min(five,two));
    }
    private static long fp(long num){
        int cnt = 0;
        while(num >= 5){
            cnt += num/5;
            num /= 5;
        }
        return cnt;
    }
    private static long tp(long num){
        int cnt = 0;
        while(num >= 2){
            cnt += num/2;
            num /= 2;
        }
        return cnt;
    }
}