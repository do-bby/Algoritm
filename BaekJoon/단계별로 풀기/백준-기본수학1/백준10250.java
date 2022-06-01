import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int x, y;
            if(r%h == 0){
                y=h*100;
                x=r/h;
            }
            else{
                y=(r%h)*100;
                x=(r/h)+1;
            }
            int xxyy = y+x;
            System.out.println(xxyy);
        }
        
        
        
    }
}