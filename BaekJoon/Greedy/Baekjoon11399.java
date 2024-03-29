import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i = 0; i<n;i++){
            for(int j = 0; j<=i;j++){
                sum += arr[j];
            }
        }
        System.out.print(sum);
    }
}
