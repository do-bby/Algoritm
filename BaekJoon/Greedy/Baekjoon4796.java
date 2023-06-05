import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon4796 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 1; ;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if(l == 0 && p == 0 && v == 0){
                break;
            }
            int ans = l*(v/p)+v%p;
            System.out.println("Case "+i+": "+ans);

        }
    }
}
