import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i =0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int cnt = 0;
            int n = Integer.parseInt(br.readLine());
            for(int j = 0;j<n;j++){
                st = new StringTokenizer(br.readLine(), " ");
                int nx = Integer.parseInt(st.nextToken());
                int ny = Integer.parseInt(st.nextToken());
                int nr = Integer.parseInt(st.nextToken());
                
                boolean hs = HC(x1,y1,nx,ny,nr);
                boolean he = HC(x2,y2,nx,ny,nr);
                
                if(!(hs && he) && (hs || he)){
                    cnt++;
                }                
            }    
            System.out.println(cnt);
        }        
    }
    public static boolean HC(int x,int y,int nx,int ny,int nr){
        return Math.sqrt(Math.pow(nx-x,2) + Math.pow(ny-y,2))<nr;
    }
}