import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon13305 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] d = new long[n-1];
        long[] l = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<d.length;i++){
            d[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<l.length;i++){
            l[i] = Long.parseLong(st.nextToken());
        }
        long min = l[0];
        long sum = 0;
        for(int i = 0;i<n-1;i++){
            if(min>l[i]){
                min = l[i];
            }
            sum+=(min*d[i]);
        }
        System.out.print(sum);
    }
}
