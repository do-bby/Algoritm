import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon11047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int cnt = 0;
        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] > k){
                continue;
            }
            else{
                cnt += k/arr[i];
                k %= arr[i];
            }
        }
        System.out.print(cnt);

    }
}
