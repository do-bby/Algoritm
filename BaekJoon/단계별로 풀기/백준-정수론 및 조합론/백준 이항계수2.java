import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        dp = new int[n+1][m+1];
        System.out.println(BC(n,m));
    }
    static int BC(int a, int b){
        
        if(dp[a][b]>0){
            return dp[a][b];
        }
        if(a==b||b==0){
            return dp[a][b]=1;
        }
        return dp[a][b] =(BC(a-1,b-1) + BC(a-1,b))%10007;
    }
}