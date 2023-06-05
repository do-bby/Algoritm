import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1449 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int cnt = 1;
        double start = arr[0]+l-0.5;
        for(int i = 1;i<arr.length;i++){
            if(start<arr[i]){
                start = arr[i]+l-0.5;
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
