import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            
            HashMap<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            
            while(n-- > 0){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String kind = st.nextToken();
                if(map.containsKey(kind)){
                    map.put(kind, map.get(kind)+1);
                }
                else{
                    map.put(kind,1);
                }
             }
            int r =1;
            for(int val : map.values()){
                r*=(val+1);
            }
            System.out.println(r-1);
        }        
        
    }
}