import java.io.*;
import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());        
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        int minx = Math.min(x,w-x);
        int miny = Math.min(y,h-y);
        
        System.out.println(Math.min(minx,miny));
        
    }
}