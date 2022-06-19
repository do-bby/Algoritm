import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] ans = new int[3][2];
        StringTokenizer st;
        for(int i = 0; i<3;i++){
            st = new StringTokenizer(br.readLine(), " ");
            ans[i][0] = Integer.parseInt(st.nextToken());
            ans[i][1] = Integer.parseInt(st.nextToken());
        }
        int x;
        int y;
        if(ans[0][0] == ans[1][0]){
            x = ans[2][0];
        }
        else if(ans[0][0] == ans[2][0]){
            x=ans[1][0];
        }
        else{
            x=ans[0][0];
        }
        
        if(ans[0][1] == ans[1][1]){
            y = ans[2][1];
        }
        else if(ans[0][1] == ans[2][1]){
            y=ans[1][1];
        }
        else{
            y=ans[0][1];
        }
        System.out.print(x + " " + y);
    }
}