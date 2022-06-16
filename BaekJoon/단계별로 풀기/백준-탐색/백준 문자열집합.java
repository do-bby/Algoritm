import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(int i = 0; i<n;i++){
            map.put(br.readLine(), 0);
        }
        
        for(int i =0; i<m;i++){
            String s = br.readLine();
            if(map.get(s) != null){
                cnt++;
            }
        }
        System.out.print(cnt);
        
    }
    
}