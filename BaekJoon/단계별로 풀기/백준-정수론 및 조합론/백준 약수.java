import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(n-- > 0){
            
            int N = Integer.parseInt(st.nextToken());
            if(max<N) max = N;
            if(min>N) min = N;
        }
        System.out.println(max*min);
        
    }
}