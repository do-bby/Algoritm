import java.io.*;
import java.util.Arrays;

public class Baekjoon2012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long sum = 0;
        for(int i = 0; i<n;i++){
            sum+=Math.abs(arr[i]-(i+1));
        }
        System.out.print(sum);
    }
}
