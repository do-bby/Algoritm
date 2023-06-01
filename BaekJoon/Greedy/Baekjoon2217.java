import java.io.*;
import java.util.Arrays;

public class Baekjoon2217 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i = 0; i<arr.length;i++){
            max = Math.max(max,arr[i]*(n-i));
        }
        System.out.print(max);
    }
}
