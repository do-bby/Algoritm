import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{    
    private static int arr[];   
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        arr=new int[m];        
        dfs(n,m,1,0);
        System.out.println(sb);        
    }
    public static void dfs(int n , int m,int at, int depth){
        if(depth == m){
            for(int val:arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i =at;i<=n;i++){
            arr[depth] = i;
            dfs(n,m,i+1,depth+1);                            
        }
    }
}