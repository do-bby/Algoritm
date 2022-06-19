import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dis = new int[6];
        StringTokenizer st;
        int dir = 0;
        int max_h = 0;
        int max_w = 0;
        int max_h_i = -1;
        int max_w_i = -1;
        for(int i = 0;i <6;i++){
            st = new StringTokenizer(br.readLine(), " ");
            dir = Integer.parseInt(st.nextToken());
            dis[i] = Integer.parseInt(st.nextToken());
            if(dir == 1 || dir == 2){
                if(max_h < dis[i]){
                    max_h = dis[i];
                    max_h_i = i;
                }
            } else{
                if(max_w < dis[i]){
                    max_w=dis[i];
                    max_w_i=i;
                }
            }
        }
        int maxsquare = max_w*max_h;
        int minsquare = dis[(max_w_i + 3)%6] * dis[(max_h_i+3)%6];
        
        System.out.println((maxsquare-minsquare)*n);
    }
}