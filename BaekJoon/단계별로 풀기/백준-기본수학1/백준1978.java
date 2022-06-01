import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        
        for(int i = 0; i<t; i++){            
            int a = Integer.parseInt(st.nextToken());            
            for(int j =2; j<=a;j++){
                if(j == a){
                    cnt++;
                }
                else if(a%j==0){
                    break;
                }
            }
            
        }
        System.out.print(cnt);
        
    }
}