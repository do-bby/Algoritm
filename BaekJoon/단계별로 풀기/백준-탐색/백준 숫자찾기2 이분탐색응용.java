import java.io.*;
import java.util.*;

public class Main{
    static int[] num;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        
        int m = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<m; i++){
            int key = Integer.parseInt(st.nextToken());
            
            sb.append(upb(num,key) - lob(num,key)).append(' ');
        }
        System.out.println(sb);
        
    }
    public static int lob(int[] num, int key){
        int lo=0;
        int hi = num.length;
        
        while(lo<hi){
            int mid = (lo+hi)/2;
            
            if(key<=num[mid]){
                hi = mid;
            }
            else{
                lo=mid+1;                
            }
        }
        return lo;
    }
    public static int upb(int[] num, int key){
        int lo=0;
        int hi = num.length;
        
        while(lo<hi){
            int mid = (lo+hi)/2;
            
            if(key<num[mid]){
                hi = mid;
            }
            else{
                lo=mid+1;                
            }
        }
        return lo;
    }
}