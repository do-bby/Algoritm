import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1026 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n;i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int ans = 0;
        for(int i = 0; i<n;i++){
            ans += a[i]*b[b.length-i-1];
        }
        System.out.print(ans);
    }
}
