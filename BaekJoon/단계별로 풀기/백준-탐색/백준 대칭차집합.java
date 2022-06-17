import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<Integer> a = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ;i<n;i++){
            int num = Integer.parseInt(st.nextToken());
            a.add(num);
        }
        HashSet<Integer> b = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ;i<m;i++){
            int num = Integer.parseInt(st.nextToken());
            b.add(num);
        }
        int cnt = 0;
        for(int number:a){
            if(!b.contains(number)){
                cnt+=1;
            }
        }
        for(int number:b){
            if(!a.contains(number)){
                cnt+=1;
            }
        }
        System.out.println(cnt);
    }
}