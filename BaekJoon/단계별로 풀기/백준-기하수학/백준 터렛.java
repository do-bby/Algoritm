import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            
            System.out.println(point(x1,y1,r1,x2,y2,r2));
        }
    }
    public static int point(int x1,int y1,int r1,int x2,int y2,int r2){
        int dist = (int)(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        
        //접점이 무한일때
        if(x1 == x2 && y1 == y2 && r1 == r2){
            return -1;            
        }
        
        //두점 사이 거리가 원의 반지름 합보다 클 때
        else if(dist > Math.pow(r1+r2,2)){
            return 0;
        }
        
        //원 안에 다른원이 있으면서 접점이 없을 때
        else if(dist < Math.pow(r2-r1,2)){
            return 0;
        }
        
        //내접할 때
        else if(dist == Math.pow(r2-r1,2)){
            return 1;
        }
        
        //외접할 때
        else if(dist == Math.pow(r1+r2,2)){
            return 1;
        }
        else{
            return 2;
        }
    }
}