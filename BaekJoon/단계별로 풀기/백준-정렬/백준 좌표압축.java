import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashMap;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[] snum = new int[n];
        HashMap<Integer,Integer> rank = new HashMap<Integer,Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<n;i++){            
            snum[i] = num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(snum);
        
        int r = 0;
        for(int v : snum){
            if(!rank.containsKey(v)){
                rank.put(v,r);
                r++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int key: num){
            int a = rank.get(key);
            sb.append(a).append(' ');
        }
        System.out.println(sb);
    }
}