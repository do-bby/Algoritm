import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int x2 = x1+w;
        int y2 = y1+h;
        int r = h/2;
        int yh = y1+r;        
        for(int i =0; i<p; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int nx = Integer.parseInt(st.nextToken());
            int ny = Integer.parseInt(st.nextToken());
            if((x1<=nx&&x2>=nx && y1<=ny&&y2>=ny) || GD(nx,ny,x1,yh) <= r || GD(nx,ny,x2,yh) <= r){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    private static double GD(int nx,int ny, int x, int y){
        return Math.sqrt(Math.pow(nx-x,2) + Math.pow(ny-y,2));
    }
}