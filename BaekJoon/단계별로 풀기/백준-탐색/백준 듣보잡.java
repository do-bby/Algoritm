import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st =new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(br.readLine());
        }
        ArrayList<String> result = new ArrayList<>();
        for(int i =0; i<m;i++){
            String t = br.readLine();
            if(set.contains(t)){
                result.add(t);
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(String s:result){
            System.out.println(s);
        }
    }
}