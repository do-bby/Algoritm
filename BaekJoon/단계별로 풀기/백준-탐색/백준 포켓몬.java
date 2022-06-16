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
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] name = new String[n+1];
                
        for(int i = 1; i<=n; i++){
            String na = br.readLine(); 
            map.put(na, i);
            name[i] = na;
        }
        for(int i =0; i<m; i++){
            String s = br.readLine();
            if(check(s) != true){
                System.out.println(map.get(s));
            }
            else{
                System.out.println(name[Integer.parseInt(s)]);
            }
        }
    }
    public static boolean check(String a){
        char tmp;
        for(int i =0; i<a.length(); i++){
            tmp = a.charAt(i);
            
            if(Character.isDigit(tmp) == false){
                return false;
            }
            
        }
        return true;
    }
}