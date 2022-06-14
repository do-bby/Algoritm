import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] num = new int[n][2];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            num[i][0] = Integer.parseInt(st.nextToken());
            num[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < n; i++){
            int r = 1;
            
            for(int j=0; j<n;j++){
                if(i==j){
                    continue;
                }
                if(num[i][0] < num[j][0] && num[i][1] < num[j][1]){
                    r++;
                }
            }
            System.out.print(r + " ");
        }
        
        
    }
}